/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.24 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `module` */

DROP TABLE IF EXISTS `module`;

CREATE TABLE `module` (
  `id` varchar(32) NOT NULL,
  `module_name` varchar(255) DEFAULT NULL COMMENT '功能模块名称',
  `value` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '第几级菜单',
  `url` varchar(255) DEFAULT NULL COMMENT '菜单url',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '该功能所属模块id',
  `create_time` datetime DEFAULT NULL,
  `creater` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module` */

insert  into `module`(`id`,`module_name`,`value`,`type`,`url`,`parent_id`,`create_time`,`creater`,`update_time`,`updater`) values ('1','首页',NULL,'top_memu',NULL,'0',NULL,NULL,NULL,NULL),('2','工单管理',NULL,'top_memu',NULL,'0',NULL,NULL,NULL,NULL),('3','预警管理',NULL,'top_memu',NULL,'0',NULL,NULL,NULL,NULL),('4','管理员管理',NULL,'top_memu',NULL,'0',NULL,NULL,NULL,NULL);

/*Table structure for table `module_role` */

DROP TABLE IF EXISTS `module_role`;

CREATE TABLE `module_role` (
  `module_id` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `role_id` varchar(32) CHARACTER SET latin1 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module_role` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` varchar(32) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL,
  `creater` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`role_name`,`description`,`create_time`,`creater`,`update_time`,`updater`) values ('1','超级管理员','超级管理员','2017-11-07 15:36:26','superAdmin','2017-11-07 15:36:39','superAdmin'),('2','管理员',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `accout` varchar(255) DEFAULT NULL COMMENT '登录账户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `sex` int(1) DEFAULT '0' COMMENT '性别（0:男,1:女）',
  `tel` int(11) DEFAULT NULL COMMENT '电话',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `creater` varchar(255) DEFAULT NULL COMMENT '创建者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `updater` varchar(255) DEFAULT NULL COMMENT '更新者',
  `del` int(1) DEFAULT '0' COMMENT '假删除（0:正常,-1:删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`accout`,`password`,`sex`,`tel`,`email`,`create_time`,`creater`,`update_time`,`updater`,`del`) values ('1','超级管理员','superAdmin','111111',0,NULL,NULL,NULL,NULL,NULL,NULL,0),('2','普通管理员','admin','111111',0,NULL,NULL,NULL,NULL,NULL,NULL,0);

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` varchar(32) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户id',
  `role_id` varchar(32) CHARACTER SET latin1 DEFAULT NULL COMMENT '角色id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
