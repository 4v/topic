/*
Navicat MySQL Data Transfer

Source Server         : fortiro
Source Server Version : 50533
Source Host           : localhost:3306
Source Database       : 4tiro

Target Server Type    : MYSQL
Target Server Version : 50533
File Encoding         : 65001

Date: 2016-04-08 17:50:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
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
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COMMENT='公司资料表';

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('34', '话题科技责任有限公司', '15988888888', '66666666', '河南郑州', '450000', 'dyenigma@163.com', '彼岸花', 'A', '2016-04-04', '2016-04-05', 'dyenigma', '中国建设银行河南分行郑州支行', '123456', '测试公司资料', '1', '1');
INSERT INTO `company` VALUES ('35', '公司名称', '联系电话', '传真', '地址', '邮编', '电子邮箱', '联系人', 'A', '2016-04-05', '2016-04-05', '负责人', '开户行', '账号', '描述', '1', '1');
INSERT INTO `company` VALUES ('36', '公司名称2', '联系电话', '传真', '地址', '邮编', '电子邮箱', '联系人', 'A', '2016-04-05', '2016-04-05', '负责人', '开户行', '账号', '描述', '1', '1');
INSERT INTO `company` VALUES ('37', '12', '12', '12', '12', '12', '12', '12', 'I', '2016-04-05', '2016-04-05', '12', '12', '12', '12', '1', '1');
INSERT INTO `company` VALUES ('38', 'name', '1212', '111', '地址1', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('39', 'name', '1212', '111', '地址2', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('40', 'name', '1212', '111', '地址3', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('41', 'name', '1212', '111', '地址4', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('42', 'name', '1212', '111', '地址5', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('43', 'name', '1212', '111', '地址6', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('44', 'name', '1212', '111', '地址7', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('45', 'name', '1212', '111', '地址8', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('46', 'name', '1212', '111', '地址9', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('47', 'name', '1212', '111', '地址10', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('48', 'name', '1212', '111', '地址11', '131', '@@', 'lianxiren', 'A', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('49', 'name', '1212', '111', '地址12', '131', '@@', 'lianxiren', 'I', '2016-04-04', '2016-04-05', 'manager', 'yinhang', 'zhanghao', 'miaosh', '1', '1');
INSERT INTO `company` VALUES ('50', 'sadf', 'asdf', 'fads', 'asdf', 'asdf', 'adsf', 'f', 'A', '2016-04-07', '2016-04-07', 'asdf', 'adsf', 'ads', 'asdf', '1', '1');

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
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

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `ORGANIZATIONID` int(11) NOT NULL AUTO_INCREMENT COMMENT '组织机构自动ID',
  `COMPANYID` int(11) DEFAULT NULL COMMENT '从属公司ID',
  `MYID` varchar(25) DEFAULT NULL COMMENT '组织自编码',
  `PID` int(10) DEFAULT NULL COMMENT '父组织ID',
  `FULLNAME` varchar(255) DEFAULT NULL COMMENT '组织名称',
  `ENAME` varchar(100) DEFAULT NULL COMMENT '英文名称',
  `MANAGER` int(10) DEFAULT NULL COMMENT '主负责人',
  `ICONCLS` varchar(100) DEFAULT NULL COMMENT '图标',
  `STATE` varchar(20) DEFAULT NULL,
  `EMPQTY` int(10) DEFAULT NULL COMMENT '编制人员数',
  `STATUS` char(1) DEFAULT NULL COMMENT '状态',
  `CREATED` date DEFAULT NULL COMMENT '创造日期',
  `LASTMOD` date DEFAULT NULL COMMENT '修改日期',
  `TEL` varchar(50) DEFAULT NULL COMMENT '电话',
  `FAX` varchar(50) DEFAULT NULL COMMENT '传真',
  `DESCRIPTION` varchar(2000) DEFAULT NULL COMMENT '备注',
  `CREATER` int(10) DEFAULT NULL COMMENT '创建人',
  `MODIFYER` int(10) DEFAULT NULL COMMENT '修改人',
  `COMPANYNAME` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `PNAME` varchar(255) DEFAULT NULL COMMENT '上级组织名称',
  PRIMARY KEY (`ORGANIZATIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='组织部门资料表';

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES ('23', '34', 'topic', null, '话题项目组', 'topic co.', '1', 'icon-flower', 'closed', '10', 'A', '2016-04-03', '2016-04-07', '15981852507', '', '管理话题', '1', '1', '话题科技责任有限公司', '');
INSERT INTO `organization` VALUES ('24', '34', '33', '23', '业务部门', '33', '1', 'icon-man', 'closed', '1', 'A', '2016-04-07', '2016-04-07', '3333', '333', '3', '1', '1', '话题科技责任有限公司', '话题项目组');
INSERT INTO `organization` VALUES ('25', '35', 'test', null, '测试', 'test', '1', 'icon-home', 'closed', '12', 'I', '2016-04-07', '2016-04-07', '', '', '', '1', '1', '公司名称', '');
INSERT INTO `organization` VALUES ('26', '36', 'ceshi', null, 'ceshi', 'cs', '1', 'icon-power', 'closed', '23', 'A', '2016-04-07', '2016-04-07', '323', '', '2323', '1', '1', '公司名称2', '');
INSERT INTO `organization` VALUES ('27', '35', '123', null, '123', '123', '25', 'icon-woman', 'closed', '12', 'A', '2016-04-07', '2016-04-07', '123', '123', '123', '1', '1', '公司名称', '');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
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
) ENGINE=InnoDB AUTO_INCREMENT=138 DEFAULT CHARSET=utf8 COMMENT='权限资料表';

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '0', '系统管理', '', '0', 'sysMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-home', 'A', '系统管理', '2013-05-23 00:00:00', '2016-03-07 16:19:42', '1', '1');
INSERT INTO `permission` VALUES ('2', '1', '菜单管理', '系统管理', '0', 'menuMgr', 'F', 'Y', 'closed', '/manage/menu/menuMain', 'icon-setting', 'A', '菜单编辑', '2013-05-23 00:00:00', '2016-04-04 16:21:39', '1', '1');
INSERT INTO `permission` VALUES ('3', '2', '菜单新增', '系统管理', '1', 'menuAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '菜单功能新增', '2013-05-24 00:00:00', '2016-03-16 09:19:06', '1', '1');
INSERT INTO `permission` VALUES ('4', '2', '菜单修改', '系统管理', '2', 'menuEdit', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-edit', 'A', '菜单功能修改', '2013-05-24 00:00:00', '2016-03-16 09:19:12', '1', '1');
INSERT INTO `permission` VALUES ('5', '2', '菜单删除', '系统管理', '3', 'menuDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-remove', 'A', '菜单功能删除', '2013-05-24 00:00:00', '2016-03-16 09:19:19', '1', '1');
INSERT INTO `permission` VALUES ('102', '0', '前端管理', '', '1', 'webMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-map', 'A', '前台页面各项设定', '2016-03-15 00:00:00', '2016-03-15 10:18:17', '1', '1');
INSERT INTO `permission` VALUES ('103', '0', '专题管理', '', '2', 'topicMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-role', 'A', '各种专题项目管理', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('104', '0', '数据备份', '', '5', 'dataBak', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-db', 'A', '数据库备份各项设定', '2016-03-15 00:00:00', '2016-03-15 10:27:16', '1', '1');
INSERT INTO `permission` VALUES ('105', '0', '日志管理', '', '3', 'logMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-info', 'A', '系统等各项日志管理，数据收集等', '2016-03-15 00:00:00', '2016-03-15 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('106', '0', '系统监控', '', '4', 'runMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-power', 'A', '系统运行监控', '2016-03-15 00:00:00', '2016-03-16 09:11:37', '1', '1');
INSERT INTO `permission` VALUES ('107', '1', '用户管理', '系统管理', '3', 'userMgr', 'F', 'Y', 'closed', '/manage/users/usersMain', 'icon-user', 'A', '用户管理，用于新增、修改、删除用户信息', '2016-03-15 00:00:00', '2016-04-04 08:14:29', '1', '1');
INSERT INTO `permission` VALUES ('108', '1', '角色管理', '系统管理', '4', 'roleMgr', 'F', 'Y', 'closed', '/manage/role/roleMgr', 'icon-star', 'A', '角色管理，用于角色的增删改与权限的分配', '2016-03-15 00:00:00', '2016-04-04 08:14:40', '1', '1');
INSERT INTO `permission` VALUES ('110', '1', '用户角色', '系统管理', '5', 'setUser', 'F', 'Y', 'closed', '/manage/userRole/setRole', 'icon-woman', 'A', '用户的角色分配', '2016-03-15 00:00:00', '2016-04-04 08:14:48', '1', '1');
INSERT INTO `permission` VALUES ('111', '1', '组织管理', '系统管理', '2', 'organMgr', 'F', 'Y', 'closed', '/manage/organ/organMain', 'icon-organ', 'A', '组织机构管理', '2016-03-15 00:00:00', '2016-04-04 08:14:20', '1', '1');
INSERT INTO `permission` VALUES ('113', '0', 'BUG管理', '', '6', 'bugMgr', 'F', 'Y', 'closed', 'javascript:void(0);', 'icon-danger', 'A', '提交BUG，反馈处理结果等', '2016-03-15 00:00:00', '2016-04-04 08:15:29', '1', '1');
INSERT INTO `permission` VALUES ('114', '106', '运行监控', '系统监控', '1', 'dataMgr', 'F', 'Y', 'closed', '/druid', 'icon-camera', 'A', '淘宝Druid监控，包含数据源、sql、web应用、uri监控、session监控、spring监控等', '2016-03-16 00:00:00', '2016-04-04 08:18:26', '1', '1');
INSERT INTO `permission` VALUES ('115', '107', '新增用户', '用户管理', '1', 'userAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('116', '107', '用户修改', '用户管理', '2', 'userEdit', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-edit', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('117', '107', '删除用户', '用户管理', '3', 'userDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-remove', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('118', '111', '新增组织', '组织管理', '1', 'organAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('119', '111', '组织编辑', '组织管理', '2', 'organEdit', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-edit', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('120', '111', '删除组织', '组织管理', '3', 'organDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-remove', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('121', '108', '新增角色', '角色管理', '1', 'roleAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '', '2016-03-16 00:00:00', '2016-04-08 08:38:41', '1', '1');
INSERT INTO `permission` VALUES ('122', '108', '角色修改', '角色管理', '2', 'roleEdit', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-edit', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('123', '108', '删除角色', '角色管理', '3', 'roleDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-remove', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('125', '110', '角色分配', '用户角色', '1', 'allotRole', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-star', 'A', '角色分配给某个用户', '2016-03-16 00:00:00', '2016-03-16 15:36:06', '1', '1');
INSERT INTO `permission` VALUES ('126', '113', '提交BUG', 'BUG管理', '1', 'bugAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('127', '113', 'BUG反馈', 'BUG管理', '2', 'bugReply', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-yes', 'A', '', '2016-03-16 00:00:00', '2016-03-16 15:39:49', '1', '1');
INSERT INTO `permission` VALUES ('128', '113', '无效BUG', 'BUG管理', '3', 'bugDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-no', 'A', '', '2016-03-16 00:00:00', '2016-03-16 16:00:15', '1', '1');
INSERT INTO `permission` VALUES ('129', '104', '定时备份', '数据备份', '1', 'autoBak', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-save', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('130', '104', '手动备份', '数据备份', '2', 'myBak', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-dbadd', 'A', '', '2016-03-16 00:00:00', '2016-03-16 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('132', '1', '公司管理', '系统管理', '1', 'compMgr', 'F', 'Y', 'closed', '/manage/comp/compMain', 'icon-company', 'A', '公司资料编辑', '2016-04-04 00:00:00', '2016-04-04 08:14:12', '1', '1');
INSERT INTO `permission` VALUES ('134', '132', '添加公司', '公司管理', '1', 'compAdd', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-add', 'A', '', '2016-04-04 00:00:00', '2016-04-04 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('135', '132', '编辑资料', '公司管理', '2', 'compEdit', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-edit', 'A', '', '2016-04-04 00:00:00', '2016-04-04 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('136', '132', '删除公司', '公司管理', '3', 'compDel', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-remove', 'A', '', '2016-04-04 00:00:00', '2016-04-04 00:00:00', '1', '1');
INSERT INTO `permission` VALUES ('137', '108', '权限设定', '角色管理', '4', 'roleSave', 'O', 'Y', 'open', 'javascript:void(0);', 'icon-save', 'A', '保存角色拥有权限的设定', '2016-04-08 00:00:00', '2016-04-08 00:00:00', '1', '1');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
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
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='系统角色资料';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员', '具有所有权限', 'A', '2013-05-20 00:00:00', '2016-04-08 00:00:00', '1', '1', '1');
INSERT INTO `role` VALUES ('12', '测试用户', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 00:00:00', '4', '1', '1');
INSERT INTO `role` VALUES ('13', '测试用户2', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '3', '1', '1');
INSERT INTO `role` VALUES ('14', '测试用户3', '测试用户', 'I', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '4', '1', '1');
INSERT INTO `role` VALUES ('15', '测试用户34', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '5', '1', '1');
INSERT INTO `role` VALUES ('16', '测试用户345', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '6', '1', '1');
INSERT INTO `role` VALUES ('17', '测试用户3456', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '7', '1', '1');
INSERT INTO `role` VALUES ('18', '测试用户34567', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '8', '1', '1');
INSERT INTO `role` VALUES ('19', '测试用户345678', '测试用户', 'I', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '9', '1', '1');
INSERT INTO `role` VALUES ('20', '测试用户3456789', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '10', '1', '1');
INSERT INTO `role` VALUES ('21', '测试用户34567890', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '11', '1', '1');
INSERT INTO `role` VALUES ('22', '测试用户345678901', '测试用户', 'A', '2016-04-08 09:38:52', '2016-04-08 09:38:54', '12', '1', '1');
INSERT INTO `role` VALUES ('23', '访客', '具有默认权限', 'A', '2016-04-08 00:00:00', '2016-04-08 00:00:00', '2', '1', '1');

-- ----------------------------
-- Table structure for rolepermission
-- ----------------------------
DROP TABLE IF EXISTS `rolepermission`;
CREATE TABLE `rolepermission` (
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
  CONSTRAINT `FK_ROLE_PERMISSION1` FOREIGN KEY (`ROLEID`) REFERENCES `role` (`ROLEID`),
  CONSTRAINT `FK_ROLE_PERMISSION2` FOREIGN KEY (`PERMISSIONID`) REFERENCES `permission` (`PERMISSIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=312 DEFAULT CHARSET=utf8 COMMENT='角色权限资料';

-- ----------------------------
-- Records of rolepermission
-- ----------------------------
INSERT INTO `rolepermission` VALUES ('1', '1', '1', 'A', '2013-06-14 00:00:00', '2013-06-18 00:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('2', '1', '2', 'A', '2013-06-14 00:00:00', '2013-06-18 00:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('275', '1', '3', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('276', '1', '4', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('277', '1', '5', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('278', '1', '102', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('279', '1', '103', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('280', '1', '104', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('281', '1', '105', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('282', '1', '106', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('283', '1', '107', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('284', '1', '108', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('285', '1', '109', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('286', '1', '110', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('287', '1', '111', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('288', '1', '112', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('289', '1', '113', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('290', '1', '114', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('291', '1', '115', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('292', '1', '116', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('293', '1', '117', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('294', '1', '118', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('295', '1', '119', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('296', '1', '120', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('297', '1', '121', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('298', '1', '122', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('299', '1', '123', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('301', '1', '125', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('302', '1', '126', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('303', '1', '127', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('304', '1', '128', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('305', '1', '129', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('306', '1', '130', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('307', '1', '131', 'A', '2016-03-16 08:00:00', '2016-03-16 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('308', '1', '136', 'A', '2016-04-04 08:00:00', '2016-04-04 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('309', '1', '134', 'A', '2016-04-04 08:00:00', '2016-04-04 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('310', '1', '135', 'A', '2016-04-04 08:00:00', '2016-04-04 08:00:00', '1', '1');
INSERT INTO `rolepermission` VALUES ('311', '1', '137', 'A', '2016-04-08 08:39:36', '2016-04-08 08:39:39', '1', '1');

-- ----------------------------
-- Table structure for userrole
-- ----------------------------
DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
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
  CONSTRAINT `FK_USER_ROLE1` FOREIGN KEY (`USERID`) REFERENCES `users` (`USERID`),
  CONSTRAINT `FK_USER_ROLE2` FOREIGN KEY (`ROLEID`) REFERENCES `role` (`ROLEID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='用户角色资料表';

-- ----------------------------
-- Records of userrole
-- ----------------------------
INSERT INTO `userrole` VALUES ('1', '1', '1', 'A', '2013-05-24 00:00:00', '2013-06-22 13:43:22', '1', '1');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
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
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='用户资料表';

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'system', 'system', 'system', '23', '话题项目组', null, null, '54B53072540EEEB8F8E9343E71F28176', '12@qq.com', null, null, null, null, null, null, null, 'A', null, '111111', null, null, null, null, '2013-06-14 00:00:00', '1', '1', '1111111');
INSERT INTO `users` VALUES ('25', 'demo', 'demo', 'demo', '23', '话题项目组', null, null, '111111', 'demo@1.com', null, null, null, null, null, null, null, 'A', null, '2222222', null, null, null, '2016-04-07 16:09:02', '2016-04-07 16:09:07', '1', '1', '2222222');
INSERT INTO `users` VALUES ('32', 'test', 'test', 'test', '26', 'ceshi', null, null, '96e79218965eb72c92a549dd5a330112', 'asdf', null, null, null, null, null, null, null, 'A', null, 'asdf', null, null, null, '2016-04-07 00:00:00', '2016-04-07 00:00:00', '1', '1', 'asdf');
