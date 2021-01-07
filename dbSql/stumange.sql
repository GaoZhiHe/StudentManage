/*
Navicat MySQL Data Transfer

Source Server         : StuMange
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : stumange

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2021-01-07 20:30:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Name` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('Admin', '123456');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sno` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('88', '航天', '25');
INSERT INTO `student` VALUES ('99', '小明', '23');
INSERT INTO `student` VALUES ('11', '飞翔的企鹅', '18');
