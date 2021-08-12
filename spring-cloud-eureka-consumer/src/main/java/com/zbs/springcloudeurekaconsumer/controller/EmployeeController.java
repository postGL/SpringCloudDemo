package com.zbs.springcloudeurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * description: EmployeeController
 * date: 2021/8/12 23:41
 * author: zbs
 * version: 1.0
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    /***
     * 注入discoveryClient 注意是Spring的包
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String getTest() {
        //获取实例列表
        List<ServiceInstance> instancesList = discoveryClient.getInstances("emp-provider");
        //获取实例
        ServiceInstance instance = instancesList.get(0);
        //获取主机地址
        String hostName = instance.getHost();
        //获取端口号
        int port = instance.getPort();
        //拼接url
        String url = "http://" + hostName + ":" + port + "/employee/getDemo";
        //调用接口
        String result = restTemplate.getForObject(url, String.class);
        //返回结果
        return result;
    }

}
