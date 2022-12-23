package com.zbs.springcloudeurekaconsumer.controller;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: EmployeeController
 * date: 2021/8/12 23:41
 * author: zbs
 * version: 1.0
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptFeignService deptFeignService;

    @GetMapping("/queryById/{id}")
    public DeptDto getTest(@PathVariable int id) {
        //调用接口
        DeptDto deptDto = deptFeignService.queryById(id);
        //返回结果
        return deptDto;
    }

}
