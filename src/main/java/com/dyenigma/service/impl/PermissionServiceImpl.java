/**
 * Title: PermissionServiceImpl.java
 * Package com.dyenigma.service.impl
 * author dingdongliang
 * date 2015年9月14日 下午4:52:52
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.service.impl;

import com.dyenigma.entity.Permission;
import com.dyenigma.model.*;
import com.dyenigma.service.PermissionService;
import com.dyenigma.shiro.ShiroUser;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.StringUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * author dingdongliang
 * ClassName: PermissionServiceImpl
 * Description: 权限业务处理实现类
 * date 2015年9月14日 下午4:52:52
 */
@Transactional
@Service("permissionService")
public class PermissionServiceImpl extends BaseServiceImpl<Permission> implements PermissionService {
    private final Logger LOGGER = LoggerFactory.getLogger(PermissionServiceImpl.class);

    @Override
    public List<MenuModel> createMenu() {

        List<Permission> pList = getShiro("F");

        // 用于存放根目录的List
        List<MenuModel> parentList = new ArrayList<>();
        // 循环的逻辑：首先遍历所有记录，当Pid为空时，该记录为根目录
        for (Permission parent : pList) {
            String id = String.valueOf(parent.getPermissionId());
            if (parent.getPid() == 0) {
                MenuModel menuModel = new MenuModel();
                menuModel.setId(id);
                menuModel.setName(String.valueOf(parent.getName()));
                menuModel.setIconCls(String.valueOf(parent.getIconCls()));
                menuModel.setUrl(String.valueOf(parent.getUrl()));
                List<MenuModel> childList = new ArrayList<>();
                for (Permission child : pList) {
                    MenuModel menuChildModel = new MenuModel();
                    String sid = String.valueOf(child.getPid());
                    if (sid.equals(id)) {
                        menuChildModel.setId(String.valueOf(child.getPermissionId()));
                        menuChildModel.setPid(sid);
                        menuChildModel.setName(String.valueOf(child.getName()));
                        menuChildModel.setIconCls(String.valueOf(child.getIconCls()));
                        menuChildModel.setUrl(String.valueOf(child.getUrl()));
                        childList.add(menuChildModel);
                    }
                }
                menuModel.setChild(childList);
                parentList.add(menuModel);
            }
        }
        return parentList;
    }

    @Override
    public List<Permission> getShiro(String type) {
        ShiroUser user = Constants.getCurrendUser();
        LOGGER.debug("获取权限user====>" + user);
        List<Permission> pList;
        // 超级管理员默认拥有所有功能权限
        if (Constants.SYSTEM_ADMINISTRATOR.equals(user.getAccount())) {
            pList = permissionMapper.adminMenu(type);
        } else {
            pList = permissionMapper.usersMenu(user.getUserId(), type);
        }
        return pList;
    }

    @Override
    public List<TreeGridModel> findByPid(String pid) {
        List<Permission> pList;
        if (pid == null || "".equals(pid)) {
            pList = permissionMapper.findAll();
        } else {
            pList = permissionMapper.findByPid(Integer.parseInt(pid));
        }
        List<TreeGridModel> tempList = new ArrayList<>();
        for (Permission permission : pList) {
            TreeGridModel treeGridModel = new TreeGridModel();
            try {
                BeanUtils.copyProperties(treeGridModel, permission);
                if (pid == null || "".equals(pid)) {
                    treeGridModel.setPid(0);
                }
                tempList.add(treeGridModel);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return tempList;
    }

    @Override
    public boolean deleteById(String id) {
        try {
            int i = permissionMapper.updateById(Integer.parseInt(id));
            //TODO 这里还要判断该id是否包含子菜单，一起删除
            //TODO 最后还要判断该菜单在角色权限表中是否有记录，需要一起删除
            //TODO 整个删除是一个事务
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<TreeModel> findSuperFunc() {
        List<Permission> pList = permissionMapper.findSuperFunc();
        List<TreeModel> tempList = new ArrayList<>();
        for (Permission function : pList) {
            TreeModel treeModel = new TreeModel();
            treeModel.setId(function.getPermissionId() + "");
            treeModel.setPid(function.getPid() == 0 ? "" : function.getPid() + "");
            treeModel.setName(function.getName());
            treeModel.setIconCls(function.getIconCls());
            treeModel.setState(Constants.TREE_STATUS_OPEN);
            tempList.add(treeModel);
        }
        return tempList;
    }

    @Override
    public boolean persistenceFunction(Permission permission) {
        Integer userId = Constants.getCurrendUser().getUserId();
        if (StringUtil.isEmpty(permission.getPermissionId() + "")) {
            permission.setCreated(new Date());
            permission.setLastmod(new Date());
            permission.setCreater(userId);
            permission.setModifyer(userId);
            permission.setStatus(Constants.PERSISTENCE_STATUS);
            if (Constants.IS_FUNCTION.equals(permission.getType())) {
                permission.setState(Constants.TREE_STATUS_CLOSED);
            } else {
                permission.setState(Constants.TREE_STATUS_OPEN);
            }
            permissionMapper.insert(permission);
        } else {
            if (Constants.IS_FUNCTION.equals(permission.getType())) {
                permission.setState(Constants.TREE_STATUS_CLOSED);
            } else {
                permission.setState(Constants.TREE_STATUS_OPEN);
            }
            permission.setLastmod(new Date());
            permission.setModifyer(userId);
            permissionMapper.update(permission);
        }
        return true;
    }



    /**
     * 获取所有的权限，用于角色权限分配
     * return
     */
    @Override
    public List<MultiMenu> multiMenu() {
        List<Permission> list = permissionMapper.findAllMenu();
        return permToMenu(0, list);
    }

    //递归转化成菜单模型
    private List<MultiMenu> permToMenu(int id, List<Permission> list) {
        List<MultiMenu> menuList = new ArrayList<>();
        list.stream().filter(perm -> perm.getPid() == id).forEach(perm -> {
            MultiMenu menu = new MultiMenu();
            menu.setId(perm.getPermissionId() + "");
            menu.setPid(perm.getPid() == 0 ? "" : perm.getPid() + "");
            menu.setIconCls(perm.getIconCls());
            menu.setName(perm.getName());
            menu.setPath(perm.getUrl());
            menu.setMyid(perm.getMyId());
            menu.setpName(perm.getPname());
            menu.setSort(perm.getSort() + "");
            menu.setIfUsed(perm.getIsused());
            menu.setType(perm.getType());
            menu.setDescription(perm.getDescription());
            menu.setChildren(permToMenu(perm.getPermissionId(), list));
            menuList.add(menu);
        });
        return menuList;
    }
}
