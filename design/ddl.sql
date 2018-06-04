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
  `status` varchar(45) DEFAULT '0' COMMENT '包装盒状态:\n0:可用\n1：不可用；损坏',
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
  `coord_type` varchar(45) DEFAULT NULL,
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



