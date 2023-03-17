package com.zbs.springcloudeurekaprovider.controller;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.springcloudeurekaprovider.biz.DeptBizService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private DeptBizService deptBizService;

    @GetMapping("/queryById/{id}")
    public DeptDto queryById(@PathVariable int id) {
        //调用接口
        return deptBizService.queryById(id);
    }

}
