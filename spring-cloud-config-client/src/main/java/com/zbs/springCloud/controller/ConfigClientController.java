package com.zbs.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: ConfigClientController
 * date: 2022/12/30 17:37
 * author: zhangbs
 * version: 1.0
 */
//@Value为git上的client-config的值
@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        return "applicationName: "+applicationName+
                "eurekaServer: "+eurekaServer+
                "port: "+port;
    }
}

