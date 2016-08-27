SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `hap_ar_customers`
-- ----------------------------
DROP TABLE IF EXISTS `hap_ar_customers`;
CREATE TABLE `hap_ar_customers` (
  `CUSTOMER_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '�ͻ�ID',
  `CUSTOMER_NUMBER` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '�ͻ����',
  `CUSTOMER_NAME` varchar(240) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '�ͻ�����',
  `COMPANY_ID` bigint(20) NOT NULL COMMENT '��˾ID',
  `ENABLED_FLAG` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT 'Y' COMMENT '���ñ�ʶ',
  `CREATION_DATE` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `CREATED_BY` bigint(20) DEFAULT '-1',
  `LAST_UPDATED_BY` bigint(20) DEFAULT '-1',
  `LAST_UPDATE_DATE` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `LAST_UPDATE_LOGIN` bigint(20) DEFAULT '-1',
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8 COMMENT='�ͻ�������';

-- ----------------------------
-- Records of hap_ar_customers
-- ----------------------------
INSERT INTO hap_ar_customers VALUES ('201', 'C001','�Ϻ���ܽ��','101', 'Y', '2016-08-24 16:48:17', '-1', '-1', '2016-08-24 16:48:17', '-1');
INSERT INTO hap_ar_customers VALUES ('202', 'C002', '������ҵ','101', 'Y', '2016-08-24 16:48:17', '-1', '-1', '2016-08-24 16:48:17', '-1');
INSERT INTO hap_ar_customers VALUES ('203', 'C003','��������', '101', 'N', '2016-08-24 16:48:17', '-1', '-1', '2016-08-24 16:48:17', '-1');
INSERT INTO hap_ar_customers VALUES ('204', 'C004','�󻪿Ƽ�', '101', 'Y', '2016-08-24 16:48:17', '-1', '-1', '2016-08-24 16:48:17', '-1');
INSERT INTO hap_ar_customers VALUES ('205', 'C005', '��Ѷ�Ƽ�','104', 'Y', '2016-08-24 16:48:17', '-1', '-1', '2016-08-24 16:48:17', '-1');
