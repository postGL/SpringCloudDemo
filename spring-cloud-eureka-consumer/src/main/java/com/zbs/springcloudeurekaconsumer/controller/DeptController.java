package com.zbs.springcloudeurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;

    //声明提供者的localhost路径
    //private static final String rest_url_prefix = "http://localhost:8001";

    //通过ribbon去实现负载均衡，这里服务应该是一个变量，通过服务名来访问   emp-provider是provider提供者application名称
    private static final String rest_url_prefix = "http://emp-provider";

    @GetMapping("/queryList")
    public String getTest() {
        //拼接url
        String url = rest_url_prefix + "/dept/queryList";
        //调用接口
        String result = restTemplate.getForObject(url, String.class);
        //返回结果
        return result;
    }

}
