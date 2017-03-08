# MySQL-Front 5.1  (Build 4.2)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: myweixin
# ------------------------------------------------------
# Server version 5.5.17

DROP DATABASE IF EXISTS `myweixin`;
CREATE DATABASE `myweixin` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `myweixin`;

#
# Source for table agent
#

DROP TABLE IF EXISTS `agent`;
CREATE TABLE `agent` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `weixin` varchar(40) NOT NULL,
  `tel` varchar(20) NOT NULL COMMENT '电话',
  `referee_weixin` varchar(40) NOT NULL COMMENT '推荐人微信',
  `leaderID1` int(11) NOT NULL COMMENT '直属领导',
  `type` char(1) NOT NULL COMMENT '1表示精英代理商，2表示经理代理商',
  `createtime` time NOT NULL,
  `leaderID2` int(11) NOT NULL COMMENT '团队领导',
  `level` int(10) NOT NULL COMMENT '1表示 一级代理商，2表示二级代理商',
  `count_sub_agents` int(10) DEFAULT NULL COMMENT '子代理商数量',
  `count_user` int(10) DEFAULT NULL COMMENT '客户数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Dumping data for table agent
#

LOCK TABLES `agent` WRITE;
/*!40000 ALTER TABLE `agent` DISABLE KEYS */;
INSERT INTO `agent` VALUES (2,'2323','liqiangbin','2323322323','23',16,'1','21:41:04',16,1,1,3);
/*!40000 ALTER TABLE `agent` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table business
#

DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '业务名称',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='业务表';

#
# Dumping data for table business
#

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
INSERT INTO `business` VALUES (2,'百度业务');
INSERT INTO `business` VALUES (12,'强制搜索业务');
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table leader
#

DROP TABLE IF EXISTS `leader`;
CREATE TABLE `leader` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL COMMENT '部门',
  `department` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

#
# Dumping data for table leader
#

LOCK TABLES `leader` WRITE;
/*!40000 ALTER TABLE `leader` DISABLE KEYS */;
INSERT INTO `leader` VALUES (16,'李强斌','鐮斿彂閮?','1391717127');
INSERT INTO `leader` VALUES (17,NULL,NULL,NULL);
/*!40000 ALTER TABLE `leader` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table manager
#

DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL COMMENT '用户名',
  `password` varchar(40) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Dumping data for table manager
#

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES (1,'root','63a9f0ea7bb98050796b649e85481845');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table myorder
#

DROP TABLE IF EXISTS `myorder`;
CREATE TABLE `myorder` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ordertime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '订单时间',
  `userID` int(10) NOT NULL,
  `yewuID` int(10) DEFAULT NULL COMMENT '业务',
  `packageID` int(10) DEFAULT NULL COMMENT '套餐',
  `price` double DEFAULT NULL,
  `num` int(10) DEFAULT NULL COMMENT '数量',
  `sum` double DEFAULT NULL COMMENT '总价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

#
# Dumping data for table myorder
#

LOCK TABLES `myorder` WRITE;
/*!40000 ALTER TABLE `myorder` DISABLE KEYS */;
INSERT INTO `myorder` VALUES (1,'1899-12-30 12:00:00',1,12,21,NULL,21,21);
INSERT INTO `myorder` VALUES (2,'2016-09-21 17:29:24',100,2,9,100,1,100);
INSERT INTO `myorder` VALUES (3,'2016-09-21 18:17:06',100,2,9,100,1,100);
INSERT INTO `myorder` VALUES (4,'2016-09-21 18:18:09',100,2,9,100,1,100);
INSERT INTO `myorder` VALUES (5,'2016-09-21 21:42:49',11,2,9,100,1,100);
INSERT INTO `myorder` VALUES (6,'2016-09-21 22:34:16',12,2,9,100,1,100);
INSERT INTO `myorder` VALUES (7,'2016-09-21 23:25:24',13,2,9,100,1,100);
INSERT INTO `myorder` VALUES (8,'2016-09-21 23:26:25',13,12,10,200,12,2400);
INSERT INTO `myorder` VALUES (9,'2016-09-22 09:18:17',14,2,9,100,1,100);
INSERT INTO `myorder` VALUES (10,'2016-09-22 09:23:58',16,12,10,200,1,200);
INSERT INTO `myorder` VALUES (11,'2016-09-29 10:37:22',17,NULL,NULL,0,1,0);
/*!40000 ALTER TABLE `myorder` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table package
#

DROP TABLE IF EXISTS `package`;
CREATE TABLE `package` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '套餐',
  `price` double NOT NULL,
  `type` char(10) NOT NULL DEFAULT '' COMMENT '1表示全词占领，2表示强制搜索，3表示优客搜索',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Dumping data for table package
#

LOCK TABLES `package` WRITE;
/*!40000 ALTER TABLE `package` DISABLE KEYS */;
INSERT INTO `package` VALUES (9,'百度业务1',100,'2');
INSERT INTO `package` VALUES (10,'500米100条强制搜索套餐1',200,'12');
/*!40000 ALTER TABLE `package` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table user
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `weixin` varchar(40) NOT NULL COMMENT '微信号',
  `referee_weixin` varchar(40) DEFAULT NULL COMMENT '推荐人id',
  `tel` int(20) NOT NULL COMMENT '电话号码',
  `createtime` datetime DEFAULT NULL,
  `agentweixin` varchar(40) DEFAULT NULL COMMENT '代理商微信',
  `leaderID` int(10) DEFAULT NULL COMMENT '领导人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

#
# Dumping data for table user
#

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (13,'12','21','12',12,'2016-09-21 23:25:24','21',16);
INSERT INTO `user` VALUES (14,'bin','bbii','liqiangbin',2332,'2016-09-22 09:18:17','liqiangbin',16);
INSERT INTO `user` VALUES (15,'cao','cao','bbii',112112,'2016-09-22 09:21:03','liqiangbin',16);
INSERT INTO `user` VALUES (16,'12','3','bbii',23,'2016-09-22 09:23:58','liqiangbin',16);
INSERT INTO `user` VALUES (17,'123','12,21,12',NULL,21,'2016-09-29 10:37:22',NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table user_order
#

DROP TABLE IF EXISTS `user_order`;
CREATE TABLE `user_order` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userid` int(10) NOT NULL COMMENT '用户id',
  `orderid` int(10) NOT NULL COMMENT '订单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table user_order
#

LOCK TABLES `user_order` WRITE;
/*!40000 ALTER TABLE `user_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_order` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
