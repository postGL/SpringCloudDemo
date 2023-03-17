package com.zbs.springcloudeurekaprovider.controller;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.springcloudeurekaprovider.db.entity.Dept;
import com.zbs.springcloudeurekaprovider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 * @author
 * @since 2022-12-22
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping("/queryById/{id}")
    public DeptDto queryById(@PathVariable int id) {
        //调用接口
        Dept dept = deptService.getById(id);
        if (ObjectUtils.isEmpty(dept)) {
            throw new RuntimeException("未找到该部门信息~");
        }
        DeptDto deptDto = new DeptDto()
                .setDeptno(dept.getDeptno())
                .setDname(dept.getDname())
                .setDbSource(dept.getDbSource());
        //返回结果
        return deptDto;
    }

}
