/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.0.67-community-nt : Database - library1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`library1` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `library1`;

/*Table structure for table `author` */

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` int(100) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `author` */

insert  into `author`(`id`,`name`) values (1,'khalid'),(2,'BALA GURU SWAMY'),(3,'KORTH '),(4,'KLP MISHRA'),(5,'FORROZEN');

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(10) default NULL,
  `name` varchar(20) default NULL,
  `author` varchar(100) default NULL,
  `publisher` varchar(100) default NULL,
  `subject` varchar(100) default NULL,
  `category` varchar(100) default NULL,
  `price` int(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `book` */

insert  into `book`(`id`,`name`,`author`,`publisher`,`subject`,`category`,`price`) values (443314,'c#','khalid','NEELKANTH','MATHEMATICS','BBBF',333),(6128802,'c#','KORTH ','NEELKANTH','MATHEMATICS','ACF',555),(4539755,'sas','BALA GURU SWAMY','GENIUS','ENGLISH','ACF',343),(2665416,'das','khalid','NEELKANTH','MATHEMATICS','BBBF',323),(8944053,'c programming','BALA GURU SWAMY','TMH','ENGLISH','BBBF',350),(8168469,'java','khalid','TMH','ENGLISH','ACF',221),(8958511,'sudershan','KORTH ','TMH','ENGLISH','ACF',2231),(4171612,'c#','BALA GURU SWAMY','GENIUS','ENGLISH','BBBF',3311),(922301,'sss','BALA GURU SWAMY','ABC','APPTITUDE','ACF',290),(2171712,'android','KORTH ','TMH','ENGLISH','NAMA',202),(7890,'android1','BALA GURU SWAMY','GENIUS','TOC','BBBF',33333),(7534435,'mybook','FORROZEN','NEELKANTH','ENGLISH','ACF',12),(12345,'helloworld','BALA GURU SWAMY','ABC','APPTITUDE','ACF',2222),(123342,'microprocessor','KLP MISHRA','GENIUS','TOC','NAMA',123);

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(100) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `category` */

insert  into `category`(`id`,`name`) values (1,'ACF'),(2,'BBBF'),(3,'NAMA');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `name` varchar(100) default NULL,
  `password` int(100) default NULL,
  `usertype` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`name`,`password`,`usertype`) values ('rajesh',123,'admin'),('suresh',100,'admin');

/*Table structure for table `name` */

DROP TABLE IF EXISTS `name`;

CREATE TABLE `name` (
  `id` int(100) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `name` */

/*Table structure for table `publisher` */

DROP TABLE IF EXISTS `publisher`;

CREATE TABLE `publisher` (
  `id` int(100) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `publisher` */

insert  into `publisher`(`id`,`name`) values (1,'TMH'),(2,'NEELKANTH'),(3,'GENIUS'),(4,'ABC');

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `id` int(100) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `subject` */

insert  into `subject`(`id`,`name`) values (1,'MATHEMATICS'),(2,'ENGLISH'),(3,'TOC'),(4,'APPTITUDE');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
