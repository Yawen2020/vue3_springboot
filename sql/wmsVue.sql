create database wms_vue
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

use wms_vue;

# 创建数据表

# 创建供应商信息表
create table supplier
(
    SUPPLIER_ID int not null auto_increment,
    SUPPLIER_NAME varchar(30) not null,
    SUPPLIER_PERSON varchar(10) not null,
    SUPPLIER_TEL varchar(20) not null,
    SUPPLIER_EMAIL varchar(20) not null,
    SUPPLIER_ADDRESS varchar(30) not null,
    primary key(SUPPLIER_ID)
)engine=innodb;

# 创建货物信息表
create table goods
(
    GOOD_ID int not null auto_increment,
    SUPPLIER_ID int not null,
    GOOD_NAME varChar(30) not null,
    GOOD_RYPE varchar(20),
    GOOD_SIZE varchar(20),
    GOOD_VALUE double not null,
    primary key(GOOD_ID),
    foreign key(SUPPLIER_ID) references from supplier(SUPPLIER_ID);
)engine=innodb;

# 导入供应商信息
INSERT INTO `supplier` VALUES (1001,'浙江奇同电器有限公司','王泽伟','13777771126','86827868@126.com','中国 浙江 温州市龙湾区 龙湾区永强大道1648号'),(1002,'醴陵春天陶瓷实业有限公司','温仙容','13974167256','23267999@126.com','中国 湖南 醴陵市 东正街15号'),(1003,'洛阳嘉吉利饮品有限公司','郑绮云','12341562721','22390898@qq.com','中国 广东 佛山市顺德区 北滘镇怡和路2号怡和中心14楼'),(1013,'深圳永辉五金有限公司','林微微','13572652345','2345112@126.com','中国 深圳 光明新区 光明农场体育公园路');

# 导入货物信息
INSERT INTO `goods` VALUES (101,1001,'五孔插座西门子墙壁开关','电器','86*86',1.85),(102,1002,'陶瓷马克杯','陶瓷','9*9*11',3.5),(103,1003,'精酿苹果醋','饮料','312ml',300),(104,1013,'螺丝','五金','1.0*0.25',1.5);