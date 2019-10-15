/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : jdbc

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-10-15 12:17:00
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `t_his_case_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_his_case_info`;
CREATE TABLE `t_his_case_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `c_no` varchar(20) NOT NULL,
  `c_info` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_his_case_info
-- ----------------------------
INSERT INTO t_his_case_info VALUES ('2', '0000000001', '良好');
INSERT INTO t_his_case_info VALUES ('3', '0000000002', '绝症');
INSERT INTO t_his_case_info VALUES ('4', '0000000005', '病例');
INSERT INTO t_his_case_info VALUES ('6', '0000000004', '绝症');
INSERT INTO t_his_case_info VALUES ('8', '0000000003', '一般般');

-- ----------------------------
-- Table structure for `t_his_department`
-- ----------------------------
DROP TABLE IF EXISTS `t_his_department`;
CREATE TABLE `t_his_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_his_department
-- ----------------------------
INSERT INTO t_his_department VALUES ('1', '外科');
INSERT INTO t_his_department VALUES ('2', '内科');
INSERT INTO t_his_department VALUES ('3', '耳鼻喉科');
INSERT INTO t_his_department VALUES ('4', '妇科');
INSERT INTO t_his_department VALUES ('5', '儿科');
INSERT INTO t_his_department VALUES ('6', '脑科');

-- ----------------------------
-- Table structure for `t_his_doctor_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_his_doctor_info`;
CREATE TABLE `t_his_doctor_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `pwd` varchar(32) NOT NULL,
  `dep` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_his_doctor_info
-- ----------------------------
INSERT INTO t_his_doctor_info VALUES ('1', '001', '张三', 'zhangsan', '1');
INSERT INTO t_his_doctor_info VALUES ('2', '002', '李四', 'lisi', '1');
INSERT INTO t_his_doctor_info VALUES ('3', '003', '王五', 'wangwu', '3');
INSERT INTO t_his_doctor_info VALUES ('4', '004', '赵六', 'zhaoliu', '5');
INSERT INTO t_his_doctor_info VALUES ('6', '15084435633', '唐宁', 'tangning', '2');
INSERT INTO t_his_doctor_info VALUES ('7', 'jie', '杨杰', 'yangjie', '4');
INSERT INTO t_his_doctor_info VALUES ('8', '123', '文进', 'wenjin', '6');

-- ----------------------------
-- Table structure for `t_his_drug_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_his_drug_info`;
CREATE TABLE `t_his_drug_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dg_name` varchar(30) NOT NULL,
  `dg_spec` varchar(10) NOT NULL,
  `dg_price` double(7,2) NOT NULL,
  `dg_inv` int(11) NOT NULL,
  `dg_uit` varchar(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_his_drug_info
-- ----------------------------
INSERT INTO t_his_drug_info VALUES ('1', '感康', '0.5mg', '30.00', '1010', '盒');
INSERT INTO t_his_drug_info VALUES ('2', '红霉素', '0.5mg', '30.00', '1111', '盒');
INSERT INTO t_his_drug_info VALUES ('3', '青霉素', '0.5mg', '30.00', '2222', '盒');
INSERT INTO t_his_drug_info VALUES ('4', '奥美拉唑', '0.5mg', '30.00', '3333', '盒');
INSERT INTO t_his_drug_info VALUES ('5', '马应龙', '0.5mg', '30.00', '4444', '盒');

-- ----------------------------
-- Table structure for `t_his_pay_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_his_pay_info`;
CREATE TABLE `t_his_pay_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dg_id` int(11) NOT NULL,
  `case_no` varchar(30) NOT NULL,
  `pay_num` int(11) NOT NULL,
  `pay_money` double(7,2) NOT NULL,
  `pay_date` date NOT NULL,
  `pay_state` int(2) NOT NULL,
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_his_pay_info
-- ----------------------------
INSERT INTO t_his_pay_info VALUES ('3', '1', '0000000001', '0', '0.00', '2019-07-24', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('4', '2', '0000000001', '0', '0.00', '2019-07-24', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('5', '5', '0000000001', '0', '0.00', '2019-07-24', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('6', '4', '0000000001', '0', '0.00', '2019-07-24', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('7', '4', '0000000001', '0', '0.00', '2019-07-24', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('8', '5', '0000000001', '0', '0.00', '2019-07-24', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('9', '1', '0000000001', '0', '0.00', '2019-07-25', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('10', '3', '0000000001', '0', '0.00', '2019-07-25', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('11', '1', '0000000001', '0', '0.00', '2019-07-25', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('12', '3', '0000000001', '0', '0.00', '2019-07-25', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('13', '1', '0000000001', '0', '0.00', '2019-07-26', '1', '全退');
INSERT INTO t_his_pay_info VALUES ('14', '2', '0000000001', '0', '0.00', '2019-07-26', '1', '全退');

-- ----------------------------
-- Table structure for `t_his_register`
-- ----------------------------
DROP TABLE IF EXISTS `t_his_register`;
CREATE TABLE `t_his_register` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `case_no` varchar(20) NOT NULL,
  `rname` varchar(20) NOT NULL,
  `sex` int(4) NOT NULL,
  `age` int(4) NOT NULL,
  `birthday` date NOT NULL,
  `settle_type` int(4) NOT NULL,
  `mcard_no` varchar(10) NOT NULL,
  `medical_type` int(4) NOT NULL,
  `id_card` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `vist_date` date NOT NULL,
  `reg_level` int(4) NOT NULL,
  `dept_no` int(11) NOT NULL,
  `dr_id` int(11) NOT NULL,
  `reg_pay` int(11) NOT NULL,
  `reg_src` int(4) NOT NULL,
  `diag_state` int(4) NOT NULL,
  `reg_state` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_his_register
-- ----------------------------
INSERT INTO t_his_register VALUES ('8', '0000000001', '唐宁', '1', '10', '2009-02-11', '0', '23456', '0', '2345678', 'wdefgr', '2019-07-09', '1', '1', '2', '10', '2', '1', '0');
INSERT INTO t_his_register VALUES ('9', '0000000002', '文退', '0', '3', '2019-07-03', '0', '124134', '0', '21412424', '重庆', '2019-07-02', '0', '1', '1', '2', '1', '0', '1');
INSERT INTO t_his_register VALUES ('10', '0000000003', '杨杰', '0', '12', '2007-06-21', '0', '21345', '0', '23456', '收到', '2019-07-18', '0', '5', '4', '2', '1', '1', '0');
INSERT INTO t_his_register VALUES ('11', '0000000004', '吴超', '0', '11', '2008-07-15', '0', '1234', '0', '2345', '阿斯蒂芬', '2019-07-09', '1', '1', '1', '10', '2', '1', '0');
INSERT INTO t_his_register VALUES ('12', '0000000005', 'aaa', '1', '23', '1996-05-15', '0', '23456', '0', '4532', 'rfbv', '2019-07-21', '1', '2', '6', '10', '1', '0', '0');
