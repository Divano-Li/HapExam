

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `hap_om_order_lines`
-- ----------------------------
DROP TABLE IF EXISTS `hap_om_order_lines`;
CREATE TABLE `hap_om_order_lines` (
  `LINE_ID` bigint(20) NOT NULL COMMENT '������ID',
  `HEADER_ID` bigint(20) NOT NULL COMMENT '����ͷID',
  `LINE_NUMBER` bigint(20) NOT NULL COMMENT '�к�',
  `INVENTORY_ITEM_ID` bigint(20) NOT NULL COMMENT '��ƷID',
  `ORDERD_QUANTITY` bigint(20) NOT NULL COMMENT '����',
  `ORDER_QUANTITY_UOM` varchar(30) NOT NULL COMMENT '��Ʒ��λ',
  `UNIT_SELLING_PRICE` bigint(20) NOT NULL COMMENT '���۵���',
  `DESCRIPTION` varchar(240) NOT NULL COMMENT '��ע',
  `COMPANY_ID` bigint(20) NOT NULL COMMENT '��˾ID',
  `ADDITION1` varchar(150) DEFAULT NULL COMMENT '������Ϣ1',
  `ADDITION2` varchar(150) DEFAULT NULL COMMENT '������Ϣ2',
  `ADDITION3` varchar(150) DEFAULT NULL COMMENT '������Ϣ3',
  `ADDITION4` varchar(150) DEFAULT NULL COMMENT '������Ϣ4',
  `ADDITION5` varchar(150) DEFAULT NULL COMMENT '������Ϣ5',
  `OBJECT_VERSION_NUMBER` decimal(20,0) DEFAULT '1' COMMENT '�а汾�ţ�����������',
  `REQUEST_ID` bigint(20) DEFAULT '-1' COMMENT '�����',
  `PROGRAM_ID` bigint(20) DEFAULT '-1',
  `CREATION_DATE` datetime DEFAULT CURRENT_TIMESTAMP,
  `CREATED_BY` decimal(20,0) DEFAULT '-1',
  `LAST_UPDATED_BY` decimal(20,0) DEFAULT '-1',
  `LAST_UPDATE_DATE` datetime DEFAULT CURRENT_TIMESTAMP,
  `LAST_UPDATE_LOGIN` decimal(20,0) DEFAULT NULL,
  `ATTRIBUTE_CATEGORY` varchar(30) DEFAULT NULL,
  `ATTRIBUTE1` varchar(240) DEFAULT NULL,
  `ATTRIBUTE2` varchar(240) DEFAULT NULL,
  `ATTRIBUTE3` varchar(240) DEFAULT NULL,
  `ATTRIBUTE4` varchar(240) DEFAULT NULL,
  `ATTRIBUTE5` varchar(240) DEFAULT NULL,
  `ATTRIBUTE6` varchar(240) DEFAULT NULL,
  `ATTRIBUTE7` varchar(240) DEFAULT NULL,
  `ATTRIBUTE8` varchar(240) DEFAULT NULL,
  `ATTRIBUTE9` varchar(240) DEFAULT NULL,
  `ATTRIBUTE10` varchar(240) DEFAULT NULL,
  `ATTRIBUTE11` varchar(240) DEFAULT NULL,
  `ATTRIBUTE12` varchar(240) DEFAULT NULL,
  `ATTRIBUTE13` varchar(240) DEFAULT NULL,
  `ATTRIBUTE14` varchar(240) DEFAULT NULL,
  `ATTRIBUTE15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`LINE_ID`),
  KEY `HAP_OM_ORDER_LINES _N1` (`HEADER_ID`),
  KEY `HAP_OM_ORDER_LINES _N2` (`INVENTORY_ITEM_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='���۶����б�';

-- ----------------------------
-- Records of hap_om_order_lines
-- ----------------------------
