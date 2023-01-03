CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';


INSERT INTO dept(dname,db_source) VALUES ('开发部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES ('项目部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES ('研发部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES ('运维部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES ('市场部',DATABASE());
INSERT INTO dept(dname,db_source) VALUES ('人事部',DATABASE());
