package com.zbs.springcloudeurekaconsumer.controller;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/queryList")
    public List<DeptDto> getTest() {
        //调用接口
        List<DeptDto> result = deptFeignService.queryDeptList();
        //返回结果
        return result;
    }

}
