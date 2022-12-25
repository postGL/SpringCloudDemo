package com.zbs.springcloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 监控页面项目：豪猪
 * @EnableHystrixDashboard // 客户端开启Hystrix Dashboard监控
 * 服务端也必须有spring-boot-starter-actuator监控
 * 		<dependency>
 * 			<groupId>org.springframework.boot</groupId>
 * 			<artifactId>spring-boot-starter-actuator</artifactId>
 * 		</dependency>
 * 	监控访问地址：http://localhost:8092/hystrix
 */
@SpringBootApplication
@EnableHystrixDashboard // 客户端开启Hystrix Dashboard监控
public class SpringCloudEurekaFeignHystrixDashboardConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaFeignHystrixDashboardConsumerApplication.class, args);
    }

}
