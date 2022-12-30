package com.zbs.springcloudeurekaprovider.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: HystrixServletDefinition
 * date: 2022/12/25 18:30
 * author: zhangbs
 * version: 1.0
 */
@Configuration
public class HystrixServletDefinition {

    /**
     * 添加一个servlet 监控流
     * http://localhost:9000/actuator/hystrix.stream
     * @return
     */
    @Bean
    public ServletRegistrationBean HystrixMetricsStreamServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet(),"/actuator/hystrix.stream");
//        servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

}
