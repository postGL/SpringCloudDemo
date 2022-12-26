### SpringCloudDemo
SpringCloud学习之旅
参考文档：

https://springcloud.cc/spring-cloud-netflix.html

中文API文档: https://springcloud.cc/spring-cloud-dalston.html

SpringCloud中国社区: http://springcloud.cn/

SpringCloud中文网: https://springcloud.cc

##### 了解学习一个功能的时候
1. 导入依赖
2. 编写配置文件
3. 开启这个功能@EnableXXX
4. 配置类

https://blog.csdn.net/qq_41694906/article/details/126648458

spring cloud和Spring Cloud Alibaba的联系和区别

SpringCloudAlibaba主要阿里为了推广自家的商业服务而开发的一套微服务架构，再加上Netflix 停止了更新，所以现在更多的公司选择使用阿里系列的整体服务
##### SpringCloud和SpringCloudAlibaba技术对比

| 名称           | SpringCloud                  | SpirngCloudAlibaba  |
| -------------- | ---------------------------- | ------------------- |
| 注册中心       | Eureka、Consul               | Nacos               |
| 配置中心       | SpringCloud Config           | Nacos               |
| 网关           | SpringCloud Zull             | SpringCloud Gateway |
| 负载均衡       | Ribbon                       | Loadbalabcer        |
| 熔断降级       | Hystrix                      | Sentinel            |
| 服务调用       | Feign                        | OpenFeign           |
| 服务总线       | Bus                          | Nacos               |
| 消息中间件     | 无(第三方替代方案：rabbitmq) | RecketMQ            |
| 分布式解决方案 | 无(第三方替代方案：2pc)      | Seata               |


![img](https://img-blog.csdnimg.cn/7a7c58395e464621a004203622cfaf16.png)

