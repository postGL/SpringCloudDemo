package com.zbs.springcloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 监控页面项目：豪猪
 * 开启@EnableHystrixDashboard // 客户端开启Hystrix Dashboard监控
 * （1）客户端配置文件：
 * hystrix:
 *   dashboard:
 *     proxy-stream-allow-list: "localhost"
 * （2）服务端：必须有spring-boot-starter-actuator监控
 * 		<dependency>
 * 			<groupId>org.springframework.boot</groupId>
 * 			<artifactId>spring-boot-starter-actuator</artifactId>
 * 		</dependency>
 * 	监控访问地址：http://localhost:8092/hystrix（备注：需要配置文件）
 * 	服务端地址：http://localhost:9000/actuator/hystrix.stream（备注：1、需要添加actuator pom 2、注册HystrixMetricsStreamServlet 3、开启Hystrix @EnableCircuitBreaker）
 */
@SpringBootApplication
@EnableHystrixDashboard // 客户端开启Hystrix Dashboard监控
public class SpringCloudEurekaFeignHystrixDashboardConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaFeignHystrixDashboardConsumerApplication.class, args);
    }

}
