package com.zbs.eureka.api.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * description: Dept
 * date: 2022/12/22 14:25
 * author: zhangbs
 * version: 1.0
 */
@Data//get 和 set
@NoArgsConstructor//无参构造
@Accessors(chain = true)//开启链式写法   例：new Dept().setid(1).setname("test")....
public class DeptDto implements Serializable {//Dept实体类 orm  类表关系映射

    private Long deptno;//主键
    private String dname;

    //存在于哪个数据库的字段 ~ 微服务，一个服务对应一个数据库，同一个信息可能存在于不同的数据库
    private String dbSource;

    //dname的有参构造
    public DeptDto(String dname) {
        this.dname = dname;
    }
}
