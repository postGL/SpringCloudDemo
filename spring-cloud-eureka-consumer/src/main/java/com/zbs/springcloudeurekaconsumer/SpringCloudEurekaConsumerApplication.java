package com.zbs.springcloudeurekaconsumer;

import com.zbs.myrule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
@EnableDiscoveryClient
//@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "EMP-PROVIDER", configuration = MyRuleConfig.class)
public class SpringCloudEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerApplication.class, args);
    }

}
