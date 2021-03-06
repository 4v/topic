/**
 * Title: OrganService.java
 * Package com.dyenigma.service
 * author dingdongliang
 * date 2015年10月10日 上午11:28:56
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.service;

import com.dyenigma.entity.Organization;
import com.dyenigma.model.TreeModel;

import java.util.List;

/**
 * ClassName: OrganService
 * Description: 组织管理业务类
 * author dingdongliang
 * date 2015年10月10日 上午11:28:56
 */

public interface OrganizationService extends BaseService<Organization> {
    /**
     * Title: findByPid
     * Description: 根据父类id获取子类组织
     * param   pid
     * param return 参数
     * return List<Organization> 返回类型
     * throws
     */
    List<Organization> findByPid(String pid);

    /**
     * Title: deleteById
     * Description: 删除某个节点组织(更新状态为I)
     * param   id
     * param return 参数
     * return boolean 返回类型
     * throws
     */
    boolean deleteById(String id);

    /**
     * Title: findSuperOrgan
     * Description: 获取所有可添加子项的组织
     * param return 参数
     * return List<TreeModel> 返回类型
     * throws
     */
    List<TreeModel> findSuperOrgan();

    /**
     * Title: persistenceOrgan
     * Description:持久化处理组织
     * param   permission
     * param return 参数
     * return boolean 返回类型
     * throws
     */
    boolean persistenceOrgan(Organization organ);
}
