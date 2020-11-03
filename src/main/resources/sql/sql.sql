CREATE TABLE `demo_member` (
   `CODE` varchar(64) NOT NULL COMMENT '用户编码',
   `NAME` varchar(64) NOT NULL COMMENT '用户名称',
   `PASSWORD` varchar(64) NOT NULL COMMENT '密码',
   `AGE` int(11) DEFAULT NULL COMMENT '年龄',
   `TEL` varchar(11) DEFAULT NULL COMMENT '电话',
   `GENDER` char(1) DEFAULT NULL COMMENT '性别',
   `REGISTER_TIME` datetime DEFAULT NULL COMMENT '注册时间',
   `STATUS` char(1) DEFAULT NULL COMMENT '状态',
   `FROZEN_TIME` datetime DEFAULT NULL COMMENT '冻结时间',
   `STAFF_CODE` varchar(64) DEFAULT NULL COMMENT '冻结人编码',
   `STAFF_NAME` varchar(64) DEFAULT NULL COMMENT '冻结人名称',
   PRIMARY KEY (`CODE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='会员管理';


CREATE TABLE `demo_product` (
    `CODE` varchar(64) NOT NULL COMMENT '商品编码',
    `NAME` varchar(64) NOT NULL COMMENT '商品名称',
    `SPEC` varchar(64) NOT NULL COMMENT '商品规格',
    `STOCK_NUMBER` int(11) DEFAULT NULL COMMENT '商品库存',
    `DATE_TIME` datetime DEFAULT NULL COMMENT '上架时间',
    `CONTENT` varchar(512) DEFAULT NULL COMMENT '商品描述',
    PRIMARY KEY (`CODE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='会员管理';


CREATE TABLE `demo_order` (
      `ORDER_NO` varchar(32) NOT NULL COMMENT '订单号',
      `NAME` varchar(64) NOT NULL COMMENT '订单名称',
      `PRODUCT_CODE` varchar(64) NOT NULL COMMENT '产品编码',
      `PRODUCT_NAME` varchar(128) NOT NULL COMMENT '产品名称',
      `NUMBER` int(11) NOT NULL COMMENT '下单数量',
      `DATE_TIME` datetime NOT NULL COMMENT '下单时间',
      `MEMBER_CODE` varchar(64) NOT NULL COMMENT '会员编码',
      `MEMBER_NAME` varchar(64) NOT NULL COMMENT '会员名称',
      `MOBILE` varchar(11) NOT NULL COMMENT '手机号',
      `ADDRESS` varchar(128) NOT NULL COMMENT '邮寄地址',
      `REMARK` varchar(128) DEFAULT NULL COMMENT '备注',
      PRIMARY KEY (`ORDER_NO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='会员管理';

INSERT INTO demo_member (CODE, NAME, PASSWORD, AGE, TEL, GENDER, REGISTER_TIME, STATUS, FROZEN_TIME, STAFF_CODE, STAFF_NAME) VALUES ('1001', '张光勇', '123456', 18, '13800000001', null, '2020-10-27 11:23:19', 'Y', null, null, null);
INSERT INTO demo_product (CODE, NAME, SPEC, STOCK_NUMBER, DATE_TIME, CONTENT) VALUES ('APPLYCOMPUTRE', '苹果笔记本电脑', '台', 100, '2020-10-01 00:00:00', '苹果笔记本电脑，内存8G，固态硬盘');
INSERT INTO demo_product (CODE, NAME, SPEC, STOCK_NUMBER, DATE_TIME, CONTENT) VALUES ('HUAWEIPC', '华为笔记本电脑', '台', 1000, '2020-10-11 00:00:00', '华为笔记本电脑，内存32G，固态硬盘500G');
INSERT INTO demo_product (CODE, NAME, SPEC, STOCK_NUMBER, DATE_TIME, CONTENT) VALUES ('SANSUNG', '三星笔记本', '台', 200, '2020-10-12 00:00:00', '三星笔记本，内存64G，固态硬盘2000G');
