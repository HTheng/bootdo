
DROP TABLE IF EXISTS `userInfo`;
DROP TABLE IF EXISTS `productImage`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `appraise`;
DROP TABLE IF EXISTS `product`;


-- ----------------------------
-- Table structure for Category
-- ----------------------------
DROP TABLE IF EXISTS `APP_category`;
CREATE TABLE `category` (
  `id_` bigint(20) NOT NULL,
  `CategoryID` int(10) NOT NULL AUTO_INCREMENT COMMENT '设置主键自增',
  `FatherCategoryID` int(10) NOT NULL COMMENT '父类别ID',
  `CategoryName` varchar(255) not null COMMENT '类别名称',
  `Sort` int DEFAULT null COMMENT '排序',
  `Hide` int default 1 COMMENT '默认为1显示， 0为隐藏',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`CategoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品类别';

-- ----------------------------
-- Table structure for AdInfo
-- ----------------------------
DROP TABLE IF EXISTS `adInfo`;
CREATE TABLE `adInfo` (
  `id_` bigint(20) NOT NULL,
  `AID` int(10) NOT NULL AUTO_INCREMENT COMMENT '设置主键自增',
  `Image` blob  DEFAULT NULL COMMENT '图片',
  `Locate` int default 0 COMMENT '用于定位',
  `Hide` int default 1 COMMENT '默认为1显示， 0为隐藏',
  `Sort` int DEFAULT NULL COMMENT '排序（留着备用）',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`AID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='存储首页滚动图片表';


-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`(
  `id_` bigint(20) NOT NULL,
  `UserID` varchar(100) NOT NULL  COMMENT '用户ID',
  `Password` VARCHAR(255) NOT NULL COMMENT '密码',
  `Reg_Phone` VARCHAR(15) NOT NULL COMMENT '注册手机',
  `WeChatID` VARCHAR(255) NOT NULL COMMENT '微信ID',
  `Integration` int default null  COMMENT '积分',
  `Balance` decimal(10,2) default null  COMMENT '余额',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户注册信息';


-- ----------------------------
-- Table structure for UserInfo
-- ----------------------------
CREATE TABLE `userInfo` (
  `id_` bigint(20) NOT NULL,
  `InfoID` int(10) NOT NULL AUTO_INCREMENT COMMENT '设置主键自增',
  `UserID` varchar(100) not null COMMENT '用户ID',
  `Name` varchar(255) not NULL COMMENT '用户姓名',
  `Phone` varchar(15) not NULL COMMENT '手机号码',
  `Address` varchar(1000) not NULL COMMENT '收货地址',
  `Zip_Code` varchar(6) not NULL  COMMENT '邮编',
  `Default_Address` int default 0 COMMENT '是否为默认地址, 0:否',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`InfoID`),
  foreign key(UserID) references Users(UserID)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户收货地址信息表';



-- ----------------------------
-- Table structure for Product
-- ----------------------------
CREATE TABLE `product` (
  `id_` bigint(20) NOT NULL,
  `ProductID` int(10) NOT NULL AUTO_INCREMENT COMMENT '设置主键自增',
  `CategoryID` int NOT NULL COMMENT '类别ID',
  `ProductName` varchar(255) not null COMMENT '产品名称',
  `Reserve` int not null COMMENT '产品库存',
  `Price` decimal(10,2) DEFAULT null COMMENT '产品价格',
  `Off_Price` decimal(10,2) DEFAULT null COMMENT '产品折价，打折后的价格',
  `Sort` int(4) DEFAULT NULL COMMENT '排序',
  `Hide` int default 1 COMMENT '默认为1显示， 0为隐藏',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '产品描述',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`ProductID`),
  foreign key(CategoryID) references Category(CategoryID)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='产品表'; 


-- ----------------------------
-- Table structure for ProductImage
-- ----------------------------
CREATE TABLE productImage(
  `id_` bigint(20) NOT NULL COMMENT '设置主键自增',
  `ProductID` INT NOT NULL  COMMENT '产品ID',
  `Image` blob not null COMMENT '产品图片',
  `Locate` int default 0 COMMENT '用于定位',
  `Sort` int(4) DEFAULT NULL COMMENT '排序',
  `Hide` int default 1 COMMENT '默认为1显示， 0为隐藏',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`id_`),
  foreign key(ProductID) references Product(ProductID) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品图片表';


-- ----------------------------
-- Table structure for Orders
-- ----------------------------
CREATE TABLE orders(
    `id_` bigint(20) NOT NULL COMMENT '设置主键自增',
    `OrderID` VARCHAR(200) NOT NULL COMMENT '自动生成（如果一个订单有多个不同商品，则插入多条记录，并且OrderID相同）',
    `ProductID` int  not null COMMENT '产品ID',
    `ProductName` varchar(255) not null COMMENT '产品名称',
    `Quantity` int  not null COMMENT '产品数量',
    `TotalPrice` Decimal(10,2)  not null COMMENT '总价',
    `OrderTime` timestamp NOT NULL DEFAULT now() COMMENT '订单时间',
    `UserID` varchar(100) not null COMMENT '用户ID',
    `InfoID` int(10) default NULL COMMENT '收货信息ID',
    `Status` int(10) NOT NULL COMMENT '0表示在购物车中；1表示已下单',
    `Payment` int(10) default 0 COMMENT '表示未付款，1已付款',
    `Delivery` int default 0 COMMENT '0:待发货； 1:已发货； 已收货',
    `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
    `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
    `create_by` bigint(20) DEFAULT NULL,
    `create_time` datetime DEFAULT now(),
    `update_by` bigint(20) DEFAULT NULL,
    `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`id_`),
    foreign key(UserID) references Users(UserID) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';


-- ----------------------------
-- Table structure for Appraise
-- ----------------------------
CREATE TABLE appraise(
    `id_` bigint(20) NOT NULL COMMENT '设置主键自增',
    `UserID` varchar(100) not null COMMENT '用户ID',
    `OrderID` VARCHAR(200) NOT NULL COMMENT '自动生成（如果一个订单有多个不同商品，则插入多条记录，并且OrderID相同）',
    `Ranks` int  not null COMMENT '好，中，差 评',
    `Content` VARCHAR(500)  not null COMMENT '评价信息',
    `Anonymous` int default 0 COMMENT '是否匿名',
    `Appraise_Date` timestamp default now()  COMMENT '评价时间',
    `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
    `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
    `create_by` bigint(20) DEFAULT NULL,
    `create_time` datetime DEFAULT now(),
    `update_by` bigint(20) DEFAULT NULL,
    `update_time` datetime DEFAULT now(),
    PRIMARY KEY (`id_`),
    foreign key(UserID) references Users(UserID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评价表';

-- ----------------------------
-- Table structure for rechargeRecord
-- ----------------------------
CREATE TABLE `rechargeRecord` (
  `id_` bigint(20) NOT NULL,
  `UserID` varchar(100) not null COMMENT '用户ID',
  `RechargeMoney` decimal(10,2) DEFAULT null COMMENT '充值',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='充值记录表';

-- ----------------------------
-- Table structure for pointAdd
-- ----------------------------
CREATE TABLE `pointAdd` (
  `id_` bigint(20) NOT NULL,
  `UserID` varchar(100) not null COMMENT '用户ID',
  `Point` decimal(10,2) DEFAULT null COMMENT '积分',
  `PointType` int  COMMENT '1表示签到所得积分，2表示购买商品所得积分',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='积分累计表';

-- ----------------------------
-- Table structure for pointChange
-- ----------------------------
CREATE TABLE `pointChange` (
  `id_` bigint(20) NOT NULL,
  `UserID` varchar(100) not null COMMENT '用户ID',
  `Point` decimal(10,2) DEFAULT null COMMENT '换取积分',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='积分换取记录表';


DROP TABLE IF EXISTS `chatHist`;


CREATE TABLE `chatHist` (
  `id_` bigint(20) NOT NULL,
  `sender_user_id` bigint(20) NOT NULL COMMENT '消息发送方用户ID',
  `receiver_user_id` bigint(20) NOT NULL COMMENT '消息接受方用户ID',
  `echat_id` bigint(20) NOT NULL COMMENT 'echat系统的聊天id 唯一',
  `content` varchar(2000) NOT NULL COMMENT '聊天内容',
  `content_type` tinyint(2) NOT NULL COMMENT '0:文本,1:图片,2:语音,3:转诊,4:处方,5:电话问诊,6:患者电话问诊请求',
  `send_time` datetime NOT NULL COMMENT '消息发送时间',
  `is_read` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否已读: 0：未读，1：已读',
  `enable_` tinyint(1) DEFAULT NULL COMMENT '启用状态',
  `remark_` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT now(),
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT now(),
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='IM聊天记录表';


