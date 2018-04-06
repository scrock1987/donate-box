-- MySQL dump 10.13  Distrib 5.7.11, for Linux (x86_64)
--
-- Host: localhost    Database: donateBox
-- ------------------------------------------------------
-- Server version	5.7.11-0ubuntu6

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `address_id` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `pin_code` int(11) NOT NULL,
  `state` varchar(255) DEFAULT NULL,
  `line` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (2,'delhi','INDIA',0,'delhi',NULL),(4,'delhi','INDIA',0,'delhi',NULL),(6,'Delhi','India',110035,'Delhi',NULL),(8,'delhi','India',110035,'Delhi',NULL),(13,'Delhi','India',110023,'Delhi','201');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation`
--

DROP TABLE IF EXISTS `donation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation` (
  `donation_id` bigint(20) NOT NULL,
  `donation_broadcast_date` datetime DEFAULT NULL,
  `donation_date` datetime DEFAULT NULL,
  `donation_type` int(11) DEFAULT NULL,
  `is_private` bit(1) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `donation_status` int(11) DEFAULT NULL,
  `ngo_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_id`),
  KEY `FK2rx4oikd7rs8ddja8k9xc25my` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation`
--

LOCK TABLES `donation` WRITE;
/*!40000 ALTER TABLE `donation` DISABLE KEYS */;
INSERT INTO `donation` VALUES (9,'2018-04-04 15:29:27','2018-04-04 15:29:27',1,'\0',1,0,NULL),(10,'2018-04-04 15:29:27','2018-04-04 15:29:27',3,'\0',1,0,NULL),(11,'2018-04-04 15:29:27','2018-04-04 15:29:27',3,'\0',1,0,NULL),(14,'2018-04-04 05:30:00','2018-04-04 05:30:00',0,'',3,0,NULL);
/*!40000 ALTER TABLE `donation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `event_id` bigint(20) NOT NULL,
  `event_type` int(11) DEFAULT NULL,
  `from_date` datetime DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `to_date` datetime DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `ngo_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`event_id`),
  KEY `FKbnsudi2pgjak7feycwo8297xi` (`address_id`),
  KEY `FKo5reysqrrkvrdmmdiy3rnqjka` (`ngo_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (12,1,'2018-04-04 18:16:27','8:00','2018-04-04 18:16:27',13,5);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (15),(15);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngo`
--

DROP TABLE IF EXISTS `ngo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ngo` (
  `ngo_id` bigint(20) NOT NULL,
  `coordinator_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rating` int(11) NOT NULL,
  `registration_number` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ngo_id`),
  KEY `FKj6ttatels3phu6hdgesyevggj` (`address_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngo`
--

LOCK TABLES `ngo` WRITE;
/*!40000 ALTER TABLE `ngo` DISABLE KEYS */;
INSERT INTO `ngo` VALUES (5,'Rahul','a@b.com','TestNgo',4,'ISO-0000111',1,'www.google.com',6),(7,'Arun','a@b.com','TestNgoparttwo',4,'ISO-0000112',0,'www.google.com',8);
/*!40000 ALTER TABLE `ngo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL,
  `dob` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` bigint(20) DEFAULT NULL,
  `user_type` int(11) DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`),
  KEY `FKddefmvbrws3hvl5t0hnnsv8ox` (`address_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,NULL,'saurabh.chawla@jktech.com',NULL,NULL,'password',1234567890,0,2),(11,NULL,'a@b.com',NULL,NULL,NULL,3232323232,1,4);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-06 17:20:51
