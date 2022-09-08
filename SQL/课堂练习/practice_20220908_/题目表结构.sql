/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : myschool

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2022-09-08 14:10:29
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `userId`   int(11) NOT NULL AUTO_INCREMENT,
    `userName` varchar(20)    DEFAULT NULL,
    `sex`      char(1)        DEFAULT NULL,
    `address`  varchar(30)    DEFAULT NULL,
    `salary`   decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`userId`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1011
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`
VALUES ('1001', '林俊杰', '男', '集美区', '99999.00');
INSERT INTO `user`
VALUES ('1002', '周杰伦', '男', '湖里区', '999999.00');
INSERT INTO `user`
VALUES ('1003', '吴奇隆', '男', '思明区', '5555.00');
INSERT INTO `user`
VALUES ('1004', '蔡徐坤', '男', '朝阳区', '33333.00');
INSERT INTO `user`
VALUES ('1005', '王源', '男', '同安区', '12345.00');
INSERT INTO `user`
VALUES ('1006', '王俊凯', '男', '翔安区', '9999.00');
INSERT INTO `user`
VALUES ('1007', '易烊千玺', '男', '海沧区', '12345.00');
INSERT INTO `user`
VALUES ('1008', '欧阳娜娜', '女', '思明区', '7000.00');
INSERT INTO `user`
VALUES ('1009', '古力娜扎', '女', '海沧区', '14756.00');
INSERT INTO `user`
VALUES ('1010', '迪丽热巴', '女', '集美区', '45251.00');
