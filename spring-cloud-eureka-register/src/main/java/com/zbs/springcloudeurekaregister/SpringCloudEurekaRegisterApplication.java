package com.zbs.springcloudeurekaregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**
 * 注册中心注解
 */
@EnableEurekaServer
public class SpringCloudEurekaRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaRegisterApplication.class, args);
    }

}
