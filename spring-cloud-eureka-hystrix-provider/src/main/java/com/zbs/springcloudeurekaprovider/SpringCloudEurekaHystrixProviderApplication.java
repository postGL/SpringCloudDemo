package com.zbs.springcloudeurekaprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// @Mapper 是对单个接口类的注解。单个操作。
// @MapperScan 是对整个包下的所有的接口类的注解。是批量的操作。使用 @MapperScan 后，接口类 就不需要使用 @Mapper 注解。
// @MapperScan：支持扫描多个包，扫描子包
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zbs.springcloudeurekaprovider.db.mapper")
// 开启、支持Hystrix熔断
@EnableCircuitBreaker
public class SpringCloudEurekaHystrixProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaHystrixProviderApplication.class, args);
    }

}
