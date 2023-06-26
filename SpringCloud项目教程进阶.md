SpringCloud-Netflix教程
狂神说springcloud：https://www.bilibili.com/video/BV1jJ411S7xr?p=1

1. 搭建eureka服务、生产者（连接数据库）、消费者（用RestTemplate restTemplate）

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-consumer</module>
   
   <module>spring-cloud-eureka-api</module>

2. 搭建eureka集群

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-consumer</module> 
   
   <module>spring-cloud-eureka-api</module>

3. 搭建provider集群

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-provider-01</module>
   
   <module>spring-cloud-eureka-provider-02</module>
   
   <module>spring-cloud-eureka-consumer</module> 
   
   <module>spring-cloud-eureka-api</module>

4. consumer用feign的方式

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-provider-01</module>
   
   <module>spring-cloud-eureka-provider-02</module>
   
   <module>spring-cloud-eureka-api</module>
   
   **<module>spring-cloud-eureka-Feign-consumer</module>**

5. hystrix熔断和降级

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-provider-01</module>
   
   <module>spring-cloud-eureka-provider-02</module>
   
   <module>spring-cloud-eureka-api</module>
   
   **<module>spring-cloud-eureka-Feign-consumer</module>**
   
   **<module>spring-cloud-eureka-hystrix-provider</module>**

6. Dashboard服务监控（可独立部署）

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-provider-01</module>
   
   <module>spring-cloud-eureka-provider-02</module>
   
   <module>spring-cloud-eureka-api</module>
   
   <module>spring-cloud-eureka-Feign-consumer</module>
   
   <module>spring-cloud-eureka-hystrix-provider</module>

   **<module>spring-cloud-eureka-Feign-Hystrix-Dashboard-consumer</module>**

7. zuul-gateway网关（可独立部署）

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-provider-01</module>
   
   <module>spring-cloud-eureka-provider-02</module>
   
   <module>spring-cloud-eureka-api</module>
   
   <module>spring-cloud-eureka-Feign-consumer</module>
   
   <module>spring-cloud-eureka-hystrix-provider</module>

   **<module>spring-cloud-eureka-zuul</module>**

8. config客户端、服务端测试 + 码云https://gitee.com/zbsdemo/spring-cloud-config.git项目

   <module>spring-cloud-eureka-server</module>
   
   <module>spring-cloud-eureka-server-01</module>
   
   <module>spring-cloud-eureka-server-02</module>
   
   <module>spring-cloud-eureka-provider</module>
   
   <module>spring-cloud-eureka-provider-01</module>
   
   <module>spring-cloud-eureka-provider-02</module>
   
   <module>spring-cloud-eureka-api</module>
   
   <module>spring-cloud-eureka-Feign-consumer</module>
   
   <module>spring-cloud-eureka-hystrix-provider</module>
   
   <module>spring-cloud-eureka-zuul</module>

   **<module>spring-cloud-config-server</module>**
   
   **<module>spring-cloud-config-client</module>**

9. 最终版
    <module>spring-cloud-config-server</module>
    
    <module>spring-cloud-eureka-server-config</module>
    
    <module>spring-cloud-eureka-hystrix-provider-config</module>
    
    <module>spring-cloud-eureka-api</module>
    
    <module>spring-cloud-eureka-Feign-consumer</module>
    
    <module>spring-cloud-eureka-zuul</module>

    <module>spring-cloud-eureka-Feign-Hystrix-Dashboard-consumer</module>

