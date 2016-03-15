DROP TABLE IF EXISTS `ROLEPERMISSION`;
DROP TABLE IF EXISTS `PERMISSION`;
DROP TABLE IF EXISTS `COMPANY`;
DROP TABLE IF EXISTS `LOG`;
DROP TABLE IF EXISTS `ORGANIZATION`;
DROP TABLE IF EXISTS `USERROLE`;
DROP TABLE IF EXISTS `USERS`;
DROP TABLE IF EXISTS `ROLE`;

-- ----------------------------
-- Table structure for `PERMISSION`
-- ----------------------------
CREATE TABLE `PERMISSION` (
  `PERMISSIONID` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限代码',
  `PID` int(11) DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `PNAME` varchar(100) DEFAULT NULL,
  `SORT` int(11) DEFAULT NULL,
  `MYID` varchar(55) DEFAULT NULL,
  `TYPE` char(1) DEFAULT NULL COMMENT 'F:FUNCTION,O:OPERATION',
  `ISUSED` char(1) DEFAULT NULL COMMENT 'Y,N',
  `STATE` varchar(20) DEFAULT NULL,
  `URL` varchar(200) DEFAULT NULL COMMENT '链接地址',
  `ICONCLS` varchar(100) DEFAULT NULL COMMENT '功能模块',
  `STATUS` char(1) NOT NULL COMMENT '状态',
  `DESCRIPTION` varchar(2000) DEFAULT NULL COMMENT '备注',
  `CREATED` datetime NOT NULL COMMENT '创造日期',
  `LASTMOD` datetime DEFAULT NULL COMMENT '修改日期',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`PERMISSIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COMMENT='权限资料表';

-- ----------------------------
-- Records of PERMISSION
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '0', '系统管理', '', '0', 'sysMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-home', 'A', '系统管理', '2013-05-23 00:00:00', '2016-03-07 16:19:42', '1', '1');
INSERT INTO `permission` VALUES ('2', '1', '菜单管理', '系统管理', '0', 'menuMgr', 'F', 'Y', 'closed', '/manage/menu/menuMain', 'icon-setting', 'A', '菜单管理', '2013-05-23 00:00:00', '2016-03-07 16:28:33', '1', '1');
INSERT INTO `permission` VALUES ('3', '2', '菜单功能新增', '系统管理', '1', 'menuAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '菜单功能新增', '2013-05-24 00:00:00', '2016-03-15 11:13:30', '1', '1');
INSERT INTO `permission` VALUES ('4', '2', '菜单功能修改', '系统管理', '2', 'menuEdit', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-edit', 'A', '菜单功能修改', '2013-05-24 00:00:00', '2016-03-15 11:13:36', '1', '1');
INSERT INTO `permission` VALUES ('5', '2', '菜单功能删除', '系统管理', '3', 'menuDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-remove', 'A', '菜单功能删除', '2013-05-24 00:00:00', '2016-03-15 11:13:42', '1', '1');
INSERT INTO `permission` VALUES ('102', '0', '前端管理', '', '1', 'webMgr', 'F', 'Y', 'closed', 'javascript:void(0)', 'icon-map', 'A', '前台页面各项设定', '2016-03-15 00:00:00', '2016-03-15 10:18:17', '1', '1');
INSERT INTO `permission` VALUES ('103', '0', '专题管理', '', '2', 'topicMgr', 'F', 'Y', 'closed', 'javascript:void(0)', 'icon-role', 'A', '各种专题项目管理', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('104', '0', '数据备份', '', '5', 'dataBak', 'F', 'Y', 'closed', 'javascript:void(0)', 'icon-db', 'A', '数据库备份各项设定', '2016-03-15 00:00:00', '2016-03-15 10:27:16', '1', '1');
INSERT INTO `permission` VALUES ('105', '0', '日志管理', '', '3', 'logMgr', 'F', 'Y', 'closed', 'javascript:void(0)', 'icon-info', 'A', '系统等各项日志管理，数据收集等', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('106', '0', '运行监控', '', '4', 'runMgr', 'F', 'Y', 'closed', 'javascript:void(0)', 'icon-power', 'A', '程序运行监控，包含sql语句、session等', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('107', '1', '用户管理', '系统管理', '1', 'userMgr', 'F', 'Y', 'closed', '/manage/user/userMgr', 'icon-user', 'A', '用户管理用于新增修改删除用户信息', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('108', '1', '角色管理', '系统管理', '2', 'roleMgr', 'F', 'Y', 'closed', '/manage/role/roleMgr', 'icon-star', 'A', '', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('109', '1', '角色权限', '系统管理', '3', 'setRole', 'F', 'Y', 'closed', '/manage/setting/setRole', 'icon-man', 'A', '角色权限分配', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('110', '1', '用户角色', '系统管理', '4', 'setUser', 'F', 'Y', 'closed', '/manage/setting/setUser', 'icon-woman', 'A', '用户的角色分配', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('111', '1', '组织管理', '系统管理', '5', 'organMgr', 'F', 'Y', 'closed', '/manage/organ/organMgr', 'icon-organ', 'A', '组织机构管理', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('112', '1', '数据字典', '系统管理', '6', 'dataMgr', 'F', 'Y', 'closed', '/manage/system/dataMgr', 'icon-data', 'A', '', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('113', '0', 'BUG管理', '', '6', 'bugMgr', 'F', 'Y', 'closed', 'javascript:void(0)', 'icon-danger', 'A', '', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');

-- -----------------------------
-- Table structure for `COMPANY`
-- -----------------------------
CREATE TABLE `COMPANY` (
  `COMPANYID` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司自动ID',
  `NAME` varchar(100) DEFAULT NULL COMMENT '公司名称',
  `TEL` varchar(50) DEFAULT NULL COMMENT '公司电话',
  `FAX` varchar(50) DEFAULT NULL COMMENT '公司传真',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '公司地址',
  `ZIP` varchar(100) DEFAULT NULL COMMENT '邮政编码',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '公司邮件地址',
  `CONTACT` varchar(100) DEFAULT NULL COMMENT '公司联络人',
  `STATUS` char(1) NOT NULL COMMENT '状态',
  `CREATED` date NOT NULL COMMENT '创造日期',
  `LASTMOD` date DEFAULT NULL COMMENT '修改日期',
  `MANAGER` varchar(100) DEFAULT NULL COMMENT '公司负责人',
  `BANK` varchar(100) DEFAULT NULL COMMENT '开户行',
  `BANKACCOUNT` varchar(100) DEFAULT NULL COMMENT '银行账号',
  `DESCRIPTION` varchar(2000) DEFAULT NULL COMMENT '备注',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`COMPANYID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='公司资料表';

-- ----------------------------
-- Table structure for `ORGANIZATION`
-- ----------------------------
CREATE TABLE `ORGANIZATION` (
  `ORGANIZATIONID` int(11) NOT NULL AUTO_INCREMENT COMMENT '组织机构自动ID',
  `COMPANYID` int(11) DEFAULT NULL COMMENT '从属公司ID',
  `MYID` varchar(25) DEFAULT NULL COMMENT '组织自编码',
  `PID` int(10) DEFAULT NULL COMMENT '父组织ID',
  `FULLNAME` varchar(255) DEFAULT NULL COMMENT '组织名称',
  `ENAME` varchar(100) DEFAULT NULL COMMENT '英文名称',
  `MANAGER` int(10) DEFAULT NULL COMMENT '主负责人',
  `ICONCLS` varchar(100) DEFAULT NULL COMMENT '图标',
  `STATE` varchar(20) DEFAULT NULL,
  `ASSISTANTMANAGER` int(10) DEFAULT NULL COMMENT '副负责人',
  `EMPQTY` int(10) DEFAULT NULL COMMENT '编制人员数',
  `STATUS` char(1) DEFAULT NULL COMMENT '状态',
  `CREATED` date DEFAULT NULL COMMENT '创造日期',
  `LASTMOD` date DEFAULT NULL COMMENT '修改日期',
  `SHORTNAME` varchar(50) DEFAULT NULL COMMENT '简称',
  `TEL` varchar(50) DEFAULT NULL COMMENT '电话',
  `FAX` varchar(50) DEFAULT NULL COMMENT '传真',
  `DESCRIPTION` varchar(2000) DEFAULT NULL COMMENT '备注',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`ORGANIZATIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='组织部门资料表';


-- ----------------------------
-- Table structure for `USERS`
-- ----------------------------
CREATE TABLE `USERS` (
  `USERID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户代码',
  `MYID` varchar(50) DEFAULT NULL COMMENT '用户自编码',
  `ACCOUNT` varchar(50) DEFAULT NULL COMMENT '账号',
  `NAME` varchar(50) DEFAULT NULL COMMENT '名称',
  `ORGANIZEID` int(11) DEFAULT NULL COMMENT '组织代码',
  `ORGANIZENAME` varchar(255) DEFAULT NULL COMMENT '组织名称',
  `DUTYID` int(11) DEFAULT NULL COMMENT '称位代码 表:SYSTEM_CODE  position',
  `TITLEID` int(11) DEFAULT NULL COMMENT '职等代码 表:SYSTEM_CODE  title',
  `PASSWORD` varchar(128) DEFAULT NULL COMMENT '密码',
  `EMAIL` varchar(200) DEFAULT NULL COMMENT '电子邮箱',
  `LANG` varchar(20) DEFAULT NULL COMMENT '语言',
  `THEME` varchar(20) DEFAULT NULL COMMENT '样式',
  `FIRSTVISIT` datetime DEFAULT NULL COMMENT '第一次登录',
  `PREVIOUSVISIT` datetime DEFAULT NULL COMMENT '上一次登录',
  `LASTVISITS` datetime DEFAULT NULL COMMENT '最后一次登录',
  `LOGINCOUNT` int(10) DEFAULT NULL COMMENT '登录资数',
  `ISEMPLOYEE` int(1) DEFAULT NULL COMMENT '是否是职工',
  `STATUS` char(1) DEFAULT NULL COMMENT '状态',
  `IP` varchar(20) DEFAULT NULL COMMENT 'IP地址',
  `DESCRIPTION` varchar(2000) DEFAULT NULL COMMENT '备注',
  `QUESTIONID` int(10) DEFAULT NULL COMMENT '问题代码',
  `ANSWER` varchar(100) DEFAULT NULL COMMENT '回复',
  `ISONLINE` int(1) DEFAULT NULL COMMENT '是否在线',
  `CREATED` datetime DEFAULT NULL COMMENT '创造日期',
  `LASTMOD` datetime DEFAULT NULL COMMENT '修改日期',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  `TEL` varchar(30) DEFAULT NULL COMMENT '用户电话',
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='用户资料表';

-- ----------------------------
-- Records of USERS
-- ----------------------------
INSERT INTO `USERS` VALUES ('1', 'system', 'system', 'system', '2', 'MIS', null, null, '54B53072540EEEB8F8E9343E71F28176', '12@qq.com', null, null, null, null, null, null, null, 'A', null, '111111', null, null, null, null, '2013-06-14 00:00:00', '1', '1', '1111111');

-- ----------------------------
-- Table structure for `ROLE`
-- ----------------------------
CREATE TABLE `ROLE` (
  `ROLEID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编码',
  `NAME` varchar(55) DEFAULT NULL COMMENT '角色名称',
  `DESCRIPTION` varchar(500) DEFAULT NULL COMMENT '角色描述',
  `STATUS` char(1) DEFAULT NULL COMMENT '角色状态',
  `CREATED` datetime DEFAULT NULL COMMENT '创造时间',
  `LASTMOD` datetime DEFAULT NULL COMMENT '修改时间',
  `SORT` int(10) DEFAULT NULL COMMENT '排序',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`ROLEID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='系统角色资料';

-- ----------------------------
-- Records of ROLE
-- ----------------------------
INSERT INTO `ROLE` VALUES ('1', '超级管理员', '超级管理员', 'A', '2013-05-20 00:00:00', '2013-06-14 00:00:00', '1', '1', '1');


-- ----------------------------
-- Table structure for `USERROLE`
-- ----------------------------
CREATE TABLE `USERROLE` (
  `URID` int(11) NOT NULL AUTO_INCREMENT,
  `USERID` int(11) NOT NULL DEFAULT '0' COMMENT '用户代码',
  `ROLEID` int(11) DEFAULT NULL COMMENT '角色代码',
  `STATUS` char(1) DEFAULT NULL COMMENT '状态',
  `CREATED` datetime DEFAULT NULL COMMENT '创造日期',
  `LASTMOD` datetime DEFAULT NULL COMMENT '修改日期',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`URID`),
  KEY `FK_USER_ROLE1` (`USERID`),
  KEY `FK_USER_ROLE2` (`ROLEID`),
  CONSTRAINT `FK_USER_ROLE1` FOREIGN KEY (`USERID`) REFERENCES `USERS` (`USERID`),
  CONSTRAINT `FK_USER_ROLE2` FOREIGN KEY (`ROLEID`) REFERENCES `ROLE` (`ROLEID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='用户角色资料表';

-- ----------------------------
-- Records of USER_ROLE
-- ----------------------------
INSERT INTO `USERROLE` VALUES ('1', '1', '1', 'A', '2013-05-24 00:00:00', '2013-06-22 13:43:22', '1', '1');

-- ----------------------------
-- Table structure for `ROLE_PERMISSION`
-- ----------------------------
CREATE TABLE `ROLEPERMISSION` (
  `RPID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ROLEID` int(11) NOT NULL COMMENT '角色代码',
  `PERMISSIONID` int(11) NOT NULL COMMENT '权限代码',
  `STATUS` char(1) DEFAULT NULL COMMENT '状态',
  `CREATED` datetime DEFAULT NULL COMMENT '创造日期',
  `LASTMOD` datetime DEFAULT NULL COMMENT '修改日期',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`RPID`),
  KEY `FK_ROLE_PERMISSION1` (`ROLEID`),
  KEY `FK_ROLE_PERMISSION2` (`PERMISSIONID`),
  CONSTRAINT `FK_ROLE_PERMISSION1` FOREIGN KEY (`ROLEID`) REFERENCES `ROLE` (`ROLEID`),
  CONSTRAINT `FK_ROLE_PERMISSION2` FOREIGN KEY (`PERMISSIONID`) REFERENCES `PERMISSION` (`PERMISSIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8 COMMENT='角色权限资料';

-- ----------------------------
-- Records of ROLE_PERMISSION
-- ----------------------------
INSERT INTO `ROLEPERMISSION` VALUES ('1', '1', '1', 'A', '2013-06-14 00:00:00', '2013-06-18 00:00:00', '1', '1');
INSERT INTO `ROLEPERMISSION` VALUES ('2', '1', '2', 'A', '2013-06-14 00:00:00', '2013-06-18 00:00:00', '1', '1');

-- ----------------------------
-- Table structure for `LOG`
-- ----------------------------
CREATE TABLE `LOG` (
  `LOGID` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志自动生成ID',
  `USERID` int(11) DEFAULT NULL COMMENT '操作用户ID',
  `NAME` varchar(20) DEFAULT NULL COMMENT '操作用户名称',
  `LOGDATE` datetime DEFAULT NULL COMMENT '日志生成时间',
  `TYPE` int(10) DEFAULT NULL COMMENT '日志类型: 1：安全日志 2：表示操作日志',
  `MAC` varchar(20) DEFAULT NULL COMMENT '物理地址',
  `IP` varchar(20) DEFAULT NULL COMMENT 'IP地址',
  `OBJECTTYPE` int(1) DEFAULT NULL COMMENT '对象类型 ',
  `OBJECTID` varchar(100) DEFAULT NULL COMMENT '操作事件写入权限编码，系统事件写入系统编码',
  `EVENTNAME` varchar(100) DEFAULT NULL COMMENT '事件名称',
  `EVENTRECORD` varchar(500) DEFAULT NULL COMMENT '详细描述',
  PRIMARY KEY (`LOGID`),
  KEY `FK_LOG1` (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=1268 DEFAULT CHARSET=utf8 COMMENT='日录资料表';
