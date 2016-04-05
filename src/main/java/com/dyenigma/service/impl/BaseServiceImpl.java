package com.dyenigma.service.impl;

import com.dyenigma.dao.*;
import com.dyenigma.service.BaseService;
import com.dyenigma.utils.GenericsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    protected BaseMapper<T> baseMapper;
    @Autowired
    protected UsersMapper usersMapper;
    @Autowired
    protected PermissionMapper permissionMapper;
    @Autowired
    protected OrganizationMapper organizationMapper;
    @Autowired
    protected CompanyMapper companyMapper;
    @SuppressWarnings("rawtypes")
    private Class clazz = null;

    public BaseServiceImpl() {
        clazz = GenericsUtils.getSuperClassGenricType(this.getClass(), 0);
    }

    /**
     * 这个方法会在构造函数和spring依赖注入之后执行
     * <p>
     * param throws Exception 设定文件
     * return void 返回类型
     * Title: init
     * Description: 通过反射来实例化baseMapper
     */
    @PostConstruct
    public void init() throws Exception {
        String objName = clazz.getSimpleName();
        String objMapperName = objName.substring(0, 1).toLowerCase() + objName.substring(1)
                + "Mapper";
        Field mapperNameField = this.getClass().getSuperclass().getDeclaredField(objMapperName);
        Object object = mapperNameField.get(this);
        Field baseMapperNameField = this.getClass().getSuperclass().getDeclaredField("baseMapper");
        baseMapperNameField.set(this, object);

    }

    @Override
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int update(T t) {
        return baseMapper.update(t);
    }

    @Override
    public int delete(int id) {
        return baseMapper.delete(id);
    }

    @Override
    public T findById(int id) {
        return baseMapper.findById(id);
    }

    @Override
    public List<T> findAll() {
        return baseMapper.findAll();
    }

    @Override
    public Long getCount(Map<String, Object> paramMap) {
        return baseMapper.getCount(paramMap);
    }


}
