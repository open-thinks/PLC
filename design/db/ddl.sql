CREATE DATABASE `plc` /*!40100 DEFAULT CHARACTER SET utf8*/;

CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cateory` varchar(45) NOT NULL COMMENT '类别',
  `item_name` varchar(45) DEFAULT NULL COMMENT '项名称',
  `item_value` int(11) DEFAULT NULL COMMENT '项值',
  `item_desc` varchar(500) DEFAULT NULL COMMENT '项描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典';

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
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `last_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='所有的站点;包含博世仓库，客户地点，供应商地点';

CREATE TABLE `pack_track` (
  `id` bigint(20) NOT NULL,
  `ship_id` bigint(20) DEFAULT NULL,
  `pack_id` bigint(20) NOT NULL,
  `track_date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='包装纸盒追踪';

CREATE TABLE `packs` (
  `id` bigint(20) NOT NULL COMMENT '惟一编号',
  `supplier` varchar(45) DEFAULT NULL COMMENT '供应商名字',
  `pack_status` tinyint(3) DEFAULT '0' COMMENT '包装盒状态:\n0:可用\n1：不可用；损坏',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='包装纸盒基本信息';

CREATE TABLE `shippings` (
  `id` bigint(20) NOT NULL,
  `ship_date` date NOT NULL COMMENT '运输日期',
  `vehicle_id` bigint(20) NOT NULL COMMENT '运输车辆id',
  `from_id` bigint(20) DEFAULT NULL COMMENT '发货地址',
  `to_id` bigint(20) DEFAULT NULL COMMENT '目的地址',
  `ship_status` tinyint(3) DEFAULT '0' COMMENT '运输状态:\n0:未开始\n1：正在运输途中\n2：运输完成\n3：取消',
  `create_date` datetime DEFAULT NULL,
  `last_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运输清单表';

CREATE TABLE `vehicle_track` (
  `id` bigint(20) NOT NULL,
  `vehicle_id` bigint(20) NOT NULL,
  `latitude` varchar(45) DEFAULT NULL,
  `longitude` varchar(45) DEFAULT NULL,
  `coord_type` tinyint(3) DEFAULT '0',
  `track_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运输车辆轨迹';

CREATE TABLE `vehicles` (
  `id` bigint(20) NOT NULL,
  `car_no` varchar(45) NOT NULL COMMENT '车牌号',
  `company` varchar(45) DEFAULT NULL COMMENT '车辆所属公司',
  `driver` varchar(45) DEFAULT NULL COMMENT '司机',
  `car_type` tinyint(3) DEFAULT NULL COMMENT '车辆类型:\n0:小型车辆\n1：中型车辆\n2：大型车辆',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运输车辆信息';


CREATE  VIEW `locations_vw` AS select `l`.`id` AS `id`,`l`.`name` AS `name`,`l`.`province` AS `province`,`l`.`city` AS `city`,`l`.`address` AS `address`,`l`.`latitude` AS `latitude`,`l`.`longitude` AS `longitude`,`l`.`coord_type` AS `coord_type`,`l`.`location_type` AS `location_type`,`l`.`create_date` AS `create_date`,`l`.`last_modify` AS `last_modify`,`d1`.`item_name` AS `coord_type_name`,`d1`.`item_desc` AS `coord_type_desc`,`d2`.`item_name` AS `location_type_name`,`d2`.`item_desc` AS `location_type_desc` from ((`locations` `l` left join `dictionary` `d1` on(((`l`.`coord_type` = `d1`.`item_value`) and (`d1`.`cateory` = 'coord_type')))) left join `dictionary` `d2` on(((`l`.`location_type` = `d2`.`item_value`) and (`d2`.`cateory` = 'location_type'))));

CREATE  VIEW `packs_vw` AS select `p`.`id` AS `id`,`p`.`supplier` AS `supplier`,`p`.`pack_status` AS `pack_status`,`p`.`create_date` AS `create_date`,`d1`.`item_name` AS `pack_status_name`,`d1`.`item_desc` AS `pack_status_desc` from (`packs` `p` left join `dictionary` `d1` on(((`p`.`pack_status` = `d1`.`item_value`) and (`d1`.`cateory` = 'pack_status'))));

CREATE  VIEW `shippings_vw` AS select `s`.`id` AS `id`,`s`.`ship_date` AS `ship_date`,`s`.`vehicle_id` AS `vehicle_id`,`s`.`from_id` AS `from_id`,`s`.`to_id` AS `to_id`,`s`.`ship_status` AS `ship_status`,`s`.`create_date` AS `create_date`,`s`.`last_modify` AS `last_modify`,`l1`.`name` AS `from_name`,`l1`.`latitude` AS `from_latitude`,`l1`.`longitude` AS `from_longitude`,`l1`.`coord_type` AS `from_coord_type`,`l1`.`location_type` AS `from_location_type`,`l1`.`province` AS `from_province`,`l1`.`city` AS `from_city`,`l1`.`address` AS `from_address`,`l2`.`name` AS `to_name`,`l2`.`latitude` AS `to_latitude`,`l2`.`longitude` AS `to_longitude`,`l2`.`coord_type` AS `to_coord_type`,`l2`.`location_type` AS `to_location_type`,`l2`.`province` AS `to_province`,`l2`.`city` AS `to_city`,`l2`.`address` AS `to_address`,`d1`.`item_name` AS `ship_status_name`,`d1`.`item_desc` AS `ship_status_desc` from (((`shippings` `s` left join `locations` `l1` on((`s`.`from_id` = `l1`.`id`))) left join `locations` `l2` on((`s`.`to_id` = `l2`.`id`))) left join `dictionary` `d1` on(((`s`.`ship_status` = `d1`.`item_value`) and (`d1`.`cateory` = 'ship_status'))));



