package com.zbs.springcloudeurekaprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zbs.springcloudeurekaprovider.db.mapper")
public class SpringCloudEurekaProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider02Application.class, args);
    }

}
