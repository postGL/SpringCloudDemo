package com.zbs.springcloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableEurekaClient只适用于使用Eureka作为注册中心的场景，@EnableDiscoveryClient可以适用于其他注册中心的场景比如nacos等。
 *
 * 在Spring Cloud的Dalston及其之前的版本中：
 *  1、从2014年的Spring Cloud 1.0.0.RC1版本开始，官方就推荐使用EnableDiscoveryClient来取代EnableEurekaClient。
 *  2、EnableEurekaClient源码中使用了注解EnableDiscoveryClient，因此如果要使用eureka的注册发现服务，两者功能是一样的。
 *  3、EnableDiscoveryClient注解在spring.factories配置中通过配置项EurekaDiscoveryClientConfiguration来开启服务注册发现功能；
 *
 * 在Dalston之后的版本中（不含Dalston）：
 *  1、在spring.factories配置中，配置类EurekaDiscoveryClientConfiguration被配置到springboot的自动配置注解中，与EnableDiscoveryClient注解没有关系了,也就是说只要开启了springboot的自动配置，服务注册发现功能就会启用。
 *  2、 EnableEurekaClient源码中没有使用注解EnableDiscoveryClient，此时EnableEurekaClient已经没用了。
 *
 */

/**
 * Ribbon和Feign的区别
 * Ribbon和Feign都是用于调用其他服务的，不过方式不同。
 * Ribbon RestFul风格
 * Feign 面向接口
 * 1.启动类使用的注解不同，Ribbon用的是@RibbonClient，Feign用的是@EnableFeignClients。
 * 2.服务的指定位置不同，Ribbon是在@RibbonClient注解上声明，Feign则是在定义抽象方法的接口中使用@FeignClient声明。
 * 3.调用方式不同，Ribbon需要自己构建http请求，模拟http请求然后使用RestTemplate发送给其他服务，步骤相当繁琐。
 * Feign则是在Ribbon的基础上进行了一次改进，采用接口的方式，将需要调用的其他服务的方法定义成抽象方法即可，
 * 不需要自己构建http请求。不过要注意的是抽象方法的注解、方法签名要和提供服务的方法完全一致。
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages="com.zbs.eureka.api.service")
public class SpringCloudEurekaFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaFeignConsumerApplication.class, args);
    }

}
