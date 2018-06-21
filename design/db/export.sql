-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: plc
-- ------------------------------------------------------
-- Server version	5.5.5-10.3.7-MariaDB-1:10.3.7+maria~jessie

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
-- Table structure for table `dictionary`
--

DROP TABLE IF EXISTS `dictionary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cateory` varchar(45) NOT NULL COMMENT '类别',
  `item_name` varchar(45) DEFAULT NULL COMMENT '项名称',
  `item_value` int(11) DEFAULT NULL COMMENT '项值',
  `item_desc` varchar(500) DEFAULT NULL COMMENT '项描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='字典';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dictionary`
--

LOCK TABLES `dictionary` WRITE;
/*!40000 ALTER TABLE `dictionary` DISABLE KEYS */;
INSERT INTO `dictionary` VALUES (1,'coord_type','GCJ-02',0,'高德地图和谷歌中国地图'),(2,'coord_type','BD-09',1,'百度地图'),(3,'coord_type','WGS84',2,'世界大地测量系统 WGS84 标准'),(4,'location_type','bosch factory',0,'博世工厂'),(5,'location_type','bosch warehouse',1,'博世仓库'),(6,'location_type','customer',5,'客户'),(7,'location_type','supplier',8,'供应商'),(8,'pack_status','avaiable',0,'可用'),(9,'pack_status','lost',1,'不可用:丢失损坏'),(10,'pack_status','delivered',2,'不可用:已交货'),(11,'pack_status','shipping',3,'不可用:运输中'),(12,'ship_status','not start',0,'未开始'),(13,'ship_status','ongoing',1,'正在运输途中'),(14,'ship_status','finished',2,'运输完成'),(15,'ship_status','canceled',3,'取消'),(16,'car_type','small',0,'小型车辆'),(17,'car_type','middle',1,'中型车辆'),(18,'car_type','larger',4,'大型车辆');
/*!40000 ALTER TABLE `dictionary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locations` (
  `id` bigint(20) NOT NULL,
  `name` varchar(45) NOT NULL COMMENT '地点名称',
  `province` varchar(45) DEFAULT NULL COMMENT '省名',
  `city` varchar(45) DEFAULT NULL COMMENT '城市名',
  `address` varchar(500) DEFAULT NULL,
  `latitude` varchar(45) DEFAULT NULL COMMENT '纬度',
  `longitude` varchar(45) DEFAULT NULL COMMENT '经度',
  `coord_type` tinyint(3) DEFAULT NULL COMMENT '坐标系类型',
  `location_type` tinyint(3) NOT NULL COMMENT '地点类型：\n0：bosch factory\n1:bosch warehouse\n2：reserve\n3：reserve\n4：reserve\n5：customer \n6:reserve\n7:reserve\n8:supplier\n9:reserve\n',
  `create_date` datetime DEFAULT current_timestamp(),
  `last_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='所有的站点;包含博世仓库，客户地点，供应商地点';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
INSERT INTO `locations` VALUES (1,'博世技术中心(苏州)有限公司','江苏','苏州','工业园区星龙街455号','31.335478','120.794214',0,0,'2018-06-14 09:32:47',NULL),(2,'博世汽车部件(苏州)有限公司','江苏','苏州','工业园区苏虹西路126号','31.328257','120.667855',0,1,'2018-06-14 09:44:17',NULL),(3,'长城汽车哈弗技术中心','河北','保定','莲池区朝阳南大街2076号','38.830489','115.461931',0,5,'2018-06-14 09:48:20',NULL),(4,'长城汽车股份有限公司徐水分公司','河北','保定','徐水区遂城镇朝阳北大街299','39.033158','115.471821',0,5,'2018-06-14 09:52:23',NULL);
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `locations_vw`
--

DROP TABLE IF EXISTS `locations_vw`;
/*!50001 DROP VIEW IF EXISTS `locations_vw`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `locations_vw` AS SELECT 
 1 AS `id`,
 1 AS `name`,
 1 AS `province`,
 1 AS `city`,
 1 AS `address`,
 1 AS `latitude`,
 1 AS `longitude`,
 1 AS `coord_type`,
 1 AS `location_type`,
 1 AS `create_date`,
 1 AS `last_modify`,
 1 AS `coord_type_name`,
 1 AS `coord_type_desc`,
 1 AS `location_type_name`,
 1 AS `location_type_desc`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `pack_track`
--

DROP TABLE IF EXISTS `pack_track`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pack_track` (
  `id` bigint(20) NOT NULL,
  `ship_id` bigint(20) DEFAULT NULL,
  `pack_id` bigint(20) NOT NULL,
  `track_date` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='包装纸盒追踪';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pack_track`
--

LOCK TABLES `pack_track` WRITE;
/*!40000 ALTER TABLE `pack_track` DISABLE KEYS */;
/*!40000 ALTER TABLE `pack_track` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packs`
--

DROP TABLE IF EXISTS `packs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packs` (
  `id` bigint(20) NOT NULL COMMENT '惟一编号',
  `supplier` varchar(45) DEFAULT NULL COMMENT '供应商名字',
  `pack_status` tinyint(3) DEFAULT 0 COMMENT '包装盒状态:\n0:可用\n1：不可用；损坏',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='包装纸盒基本信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packs`
--

LOCK TABLES `packs` WRITE;
/*!40000 ALTER TABLE `packs` DISABLE KEYS */;
/*!40000 ALTER TABLE `packs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `packs_vw`
--

DROP TABLE IF EXISTS `packs_vw`;
/*!50001 DROP VIEW IF EXISTS `packs_vw`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `packs_vw` AS SELECT 
 1 AS `id`,
 1 AS `supplier`,
 1 AS `pack_status`,
 1 AS `create_date`,
 1 AS `pack_status_name`,
 1 AS `pack_status_desc`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `shippings`
--

DROP TABLE IF EXISTS `shippings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shippings` (
  `id` bigint(20) NOT NULL,
  `ship_date` date NOT NULL COMMENT '运输日期',
  `vehicle_id` bigint(20) NOT NULL COMMENT '运输车辆id',
  `from_id` bigint(20) DEFAULT NULL COMMENT '发货地址',
  `to_id` bigint(20) DEFAULT NULL COMMENT '目的地址',
  `ship_status` tinyint(3) DEFAULT 0 COMMENT '运输状态:\n0:未开始\n1：正在运输途中\n2：运输完成\n3：取消',
  `create_date` datetime DEFAULT NULL,
  `last_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运输清单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shippings`
--

LOCK TABLES `shippings` WRITE;
/*!40000 ALTER TABLE `shippings` DISABLE KEYS */;
INSERT INTO `shippings` VALUES (1,'2018-06-20',1,1,3,0,NULL,NULL);
/*!40000 ALTER TABLE `shippings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `shippings_vw`
--

DROP TABLE IF EXISTS `shippings_vw`;
/*!50001 DROP VIEW IF EXISTS `shippings_vw`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `shippings_vw` AS SELECT 
 1 AS `id`,
 1 AS `ship_date`,
 1 AS `vehicle_id`,
 1 AS `from_id`,
 1 AS `to_id`,
 1 AS `ship_status`,
 1 AS `create_date`,
 1 AS `last_modify`,
 1 AS `from_name`,
 1 AS `from_latitude`,
 1 AS `from_longitude`,
 1 AS `from_coord_type`,
 1 AS `from_location_type`,
 1 AS `from_province`,
 1 AS `from_city`,
 1 AS `from_address`,
 1 AS `to_name`,
 1 AS `to_latitude`,
 1 AS `to_longitude`,
 1 AS `to_coord_type`,
 1 AS `to_location_type`,
 1 AS `to_province`,
 1 AS `to_city`,
 1 AS `to_address`,
 1 AS `ship_status_name`,
 1 AS `ship_status_desc`,
 1 AS `vehicle_no`,
 1 AS `vehicle_company`,
 1 AS `vehicle_driver`,
 1 AS `vehicle_type`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `vehicle_track`
--

DROP TABLE IF EXISTS `vehicle_track`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle_track` (
  `id` bigint(20) NOT NULL,
  `vehicle_id` bigint(20) NOT NULL,
  `latitude` varchar(45) DEFAULT NULL,
  `longitude` varchar(45) DEFAULT NULL,
  `coord_type` tinyint(3) DEFAULT 0,
  `track_time` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运输车辆轨迹';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_track`
--

LOCK TABLES `vehicle_track` WRITE;
/*!40000 ALTER TABLE `vehicle_track` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicle_track` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicles`
--

DROP TABLE IF EXISTS `vehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicles` (
  `id` bigint(20) NOT NULL,
  `car_no` varchar(45) NOT NULL COMMENT '车牌号',
  `company` varchar(45) DEFAULT NULL COMMENT '车辆所属公司',
  `driver` varchar(45) DEFAULT NULL COMMENT '司机',
  `car_type` tinyint(3) DEFAULT NULL COMMENT '车辆类型:\n0:小型车辆\n1：中型车辆\n2：大型车辆',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运输车辆信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicles`
--

LOCK TABLES `vehicles` WRITE;
/*!40000 ALTER TABLE `vehicles` DISABLE KEYS */;
INSERT INTO `vehicles` VALUES (1,'苏E23U53','华远运输有限公司','杨师傅',3,NULL);
/*!40000 ALTER TABLE `vehicles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `locations_vw`
--

/*!50001 DROP VIEW IF EXISTS `locations_vw`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `locations_vw` AS select `l`.`id` AS `id`,`l`.`name` AS `name`,`l`.`province` AS `province`,`l`.`city` AS `city`,`l`.`address` AS `address`,`l`.`latitude` AS `latitude`,`l`.`longitude` AS `longitude`,`l`.`coord_type` AS `coord_type`,`l`.`location_type` AS `location_type`,`l`.`create_date` AS `create_date`,`l`.`last_modify` AS `last_modify`,`d1`.`item_name` AS `coord_type_name`,`d1`.`item_desc` AS `coord_type_desc`,`d2`.`item_name` AS `location_type_name`,`d2`.`item_desc` AS `location_type_desc` from ((`locations` `l` left join `dictionary` `d1` on(`l`.`coord_type` = `d1`.`item_value` and `d1`.`cateory` = 'coord_type')) left join `dictionary` `d2` on(`l`.`location_type` = `d2`.`item_value` and `d2`.`cateory` = 'location_type')) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `packs_vw`
--

/*!50001 DROP VIEW IF EXISTS `packs_vw`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `packs_vw` AS select `p`.`id` AS `id`,`p`.`supplier` AS `supplier`,`p`.`pack_status` AS `pack_status`,`p`.`create_date` AS `create_date`,`d1`.`item_name` AS `pack_status_name`,`d1`.`item_desc` AS `pack_status_desc` from (`packs` `p` left join `dictionary` `d1` on(`p`.`pack_status` = `d1`.`item_value` and `d1`.`cateory` = 'pack_status')) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `shippings_vw`
--

/*!50001 DROP VIEW IF EXISTS `shippings_vw`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `shippings_vw` AS select `s`.`id` AS `id`,`s`.`ship_date` AS `ship_date`,`s`.`vehicle_id` AS `vehicle_id`,`s`.`from_id` AS `from_id`,`s`.`to_id` AS `to_id`,`s`.`ship_status` AS `ship_status`,`s`.`create_date` AS `create_date`,`s`.`last_modify` AS `last_modify`,`l1`.`name` AS `from_name`,`l1`.`latitude` AS `from_latitude`,`l1`.`longitude` AS `from_longitude`,`l1`.`coord_type` AS `from_coord_type`,`l1`.`location_type` AS `from_location_type`,`l1`.`province` AS `from_province`,`l1`.`city` AS `from_city`,`l1`.`address` AS `from_address`,`l2`.`name` AS `to_name`,`l2`.`latitude` AS `to_latitude`,`l2`.`longitude` AS `to_longitude`,`l2`.`coord_type` AS `to_coord_type`,`l2`.`location_type` AS `to_location_type`,`l2`.`province` AS `to_province`,`l2`.`city` AS `to_city`,`l2`.`address` AS `to_address`,`d1`.`item_name` AS `ship_status_name`,`d1`.`item_desc` AS `ship_status_desc`,`v`.`car_no` AS `vehicle_no`,`v`.`company` AS `vehicle_company`,`v`.`driver` AS `vehicle_driver`,`v`.`car_type` AS `vehicle_type` from ((((`shippings` `s` left join `locations` `l1` on(`s`.`from_id` = `l1`.`id`)) left join `locations` `l2` on(`s`.`to_id` = `l2`.`id`)) left join `dictionary` `d1` on(`s`.`ship_status` = `d1`.`item_value` and `d1`.`cateory` = 'ship_status')) left join `vehicles` `v` on(`s`.`vehicle_id` = `v`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-21 17:27:35
