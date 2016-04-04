/**
 * Title: OrganServiceImpl.java
 * Package com.dyenigma.service.impl
 * author dingdongliang
 * date 2015年10月10日 上午11:30:17
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.service.impl;

import com.dyenigma.entity.Organization;
import com.dyenigma.model.TreeModel;
import com.dyenigma.service.OrganizationService;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * author dingdongliang
 * ClassName: OrganServiceImpl
 * Description: 组织业务处理实现类
 * date 2015年10月10日 上午11:30:17
 */
@Transactional
@Service("organizationService")
public class OrganizationServiceImpl extends BaseServiceImpl<Organization> implements
        OrganizationService {
    private final Logger LOGGER = LoggerFactory.getLogger(OrganizationServiceImpl.class);

    @Override
    public List<Organization> findByPid(String pid) {
        LOGGER.debug("读取组织信息");
        List<Organization> oList;
        if (pid == null || "".equals(pid)) {
            oList = organizationMapper.findAll();
        } else {
            oList = organizationMapper.findByPid(Integer.parseInt(pid));
        }
        return oList;
    }

    @Override
    public boolean deleteById(String id) {
        try {
            int i = organizationMapper.updateById(Integer.parseInt(id));
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<TreeModel> findSuperOrgan() {
        List<Organization> organList = organizationMapper.findSuperOrgan();
        List<TreeModel> tList = new ArrayList<>();
        for (Organization organ : organList) {
            TreeModel treeModel = new TreeModel();
            treeModel.setId(organ.getOrganizationId() + "");
            treeModel.setPid(organ.getPid() == 0 ? "" : organ.getPid() + "");
            treeModel.setName(organ.getFullName());
            treeModel.setIconCls(organ.getIconCls());
            treeModel.setState(Constants.TREE_STATUS_OPEN);
            tList.add(treeModel);
        }

        return tList;
    }

    @Override
    public boolean persistenceOrgan(Organization organ) {
        Integer userId = Constants.getCurrendUser().getUserId();

        if (StringUtil.isEmpty(organ.getOrganizationId() + "")) {
            organ.setCreated(new Date());
            organ.setLastmod(new Date());
            organ.setCreater(userId);
            organ.setModifyer(userId);
            organ.setStatus(Constants.PERSISTENCE_STATUS);
            // 能添加下级树节点的都设置为TREE_STATUS_CLOSED
            organ.setState(Constants.TREE_STATUS_CLOSED);
            organizationMapper.insert(organ);
        } else {
            organ.setState(Constants.TREE_STATUS_CLOSED);
            organ.setLastmod(new Date());
            organ.setModifyer(userId);
            organizationMapper.update(organ);
        }
        return true;
    }
}
