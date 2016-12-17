CREATE TABLE business_customer
(
	id varchar(255) NOT NULL COMMENT '编号',
	name char(255) NOT NULL COMMENT '姓名',
	sex varchar(10) COMMENT '性别',
	phone varchar(100) COMMENT '电话',
	address varchar(255) COMMENT '地址',
	acreage varchar(64) DEFAULT '0' COMMENT '面积',
	status char(2) DEFAULT '0' NOT NULL COMMENT '状态标记',
	remarks varchar(255) COMMENT '备注信息',
	PRIMARY KEY (id)
) COMMENT = '客户表';

CREATE TABLE business_report
(
	id varchar(255) NOT NULL COMMENT '编号',
	region varchar(100) COMMENT '大区',
	area varchar(100) COMMENT '城区',
	report_phone varchar(100) COMMENT '报备人电话',
	report_name char(255) COMMENT '报备人姓名',
	attache_name char(255) COMMENT '渠道专员',
	remarks varchar(255) COMMENT '备注信息',
	PRIMARY KEY (id)
) COMMENT = '报备人员/渠道人员表';

CREATE TABLE business_designer
(
	id varchar(255) NOT NULL COMMENT '编号',
	designer_name varchar(255) COMMENT '设计师姓名',
	designer_phone varchar(100) COMMENT '设计师电话',
	remarks varchar(255) COMMENT '备注信息',
	PRIMARY KEY (id)
) COMMENT = '设计师表';

CREATE TABLE business_contract
(
	customer_id	varchar(255) NOT NULL COMMENT '客户编号',
	report_id varchar(255) NOT NULL COMMENT '报备人员编号',
	designer_id varchar(255) COMMENT '设计师编号',
	contract_date datetime COMMENT '联系时间',
	report_date datetime NOT NULL COMMENT '报备时间',
	update_by varchar(64) NOT NULL COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	PRIMARY KEY (id)
) COMMENT = '报备表';