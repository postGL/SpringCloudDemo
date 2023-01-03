package com.zbs.springcloudeurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: EmployeeController
 * date: 2021/8/12 23:17
 * author: zbs
 * version: 1.0
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping(value = "/getDemo")
    public String getTest() {
        return "我调到了服务";
    }

}
