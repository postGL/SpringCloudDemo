package com.zbs.springcloudeurekaconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description: RestTemplateConfiguration
 * date: 2021/8/12 23:40
 * author: zbs
 * version: 1.0
 */
@Configuration
public class RestTemplateConfiguration {

    /**
     * Rest调用RestFul请求
     * @return
     */
    @Bean
    @LoadBalanced // Ribbon 配置负载均衡实现RestTemplate
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
