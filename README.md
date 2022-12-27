### SpringCloudDemo
SpringCloud参考文档：

https://springcloud.cc/spring-cloud-netflix.html

中文API文档: https://springcloud.cc/spring-cloud-dalston.html

SpringCloud中国社区: http://springcloud.cn/

SpringCloud中文网: https://springcloud.cc

#### 1、使用一个功能的时候
```
1. 导入依赖
2. 编写配置文件
3. 开启这个功能@EnableXXX
4. 配置类
```
#### 2、springcloud常用组件
融合在每个微服务中、依赖其它组件并为其提供服务。

- Netflix Ribbon，客户端负载均衡，特性有区域亲和、重试机制。
- Netflix Hystrix，客户端容错保护，特性有服务降级、服务熔断、请求缓存、请求合并、依赖隔离。
- Netflix Feign，声明式服务调用，本质上就是Ribbon+Hystrix
- Stream，消息驱动，有Sink、Source、Processor三种通道，特性有订阅发布、消费组、消息分区。
- Bus，消息总线，配合Config仓库修改的一种Stream实现，
- Sleuth，分布式服务追踪，需要搞清楚TraceID和SpanID以及抽样，如何与ELK整合。

独自启动不需要依赖其它组件，单枪匹马都能干。

- Netflix Eureka，服务注册中心，特性有失效剔除、服务保护。
- Dashboard，Hystrix仪表盘，监控集群模式和单点模式，其中集群模式需要收集器Turbine配合。
- Netflix Zuul，API服务网关，功能有路由分发和过滤。
- Config，分布式配置中心，支持本地仓库、SVN、Git、Jar包内配置等模式。

#### 3、SpringCloudAlibaba常用组件
   SpringCloudAlibaba介绍
   
   SpringCloudAlibaba是阿里开发的一套微服务架构，目前已经纳入spring中；同Spring Cloud 一样，Spring Cloud Alibaba 也是一套微服务解决方案，包含开发分布式应用微服务的必需组件，方便开发者通过 Spring Cloud 编程模型轻松使用这些组件来开发分布式应用服务。
   
   SpringCloudAlibaba主要阿里为了推广自家的商业服务而开发的一套微服务架构，再加上Netflix 停止了更新，所以现在更多的公司选择使用阿里系列的整体服务；
   
![img](https://img-blog.csdnimg.cn/9d8dfc739a0f43818ddda32335b96497.png)

阿里开源组件：

- Nacos：一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台。
- Gateway：API网关（webflux编程模式）
- Sentinel：把流量作为切入点，从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性。
- RocketMQ：开源的分布式消息系统，基于高可用分布式集群技术，提供低延时的、高可靠的消息发布与订阅服务。
- Dubbo：这个就不用多说了，在国内应用非常广泛的一款高性能 Java RPC 框架。
- Seata：阿里巴巴开源产品，一个易于使用的高性能微服务分布式事务解决方案。
- Arthas：开源的Java动态追踪工具，基于字节码增强技术，功能非常强大。

阿里商业化组件
作为一家商业公司，阿里巴巴推出 Spring Cloud Alibaba，很大程度上市希望通过抢占开发者生态，来帮助推广自家的云产品。所以在开源社区，夹带了不少私货，这部分组件我在阿里工作时都曾经使用过，整体易用性和稳定性还是很高的。

- Alibaba Cloud ACM：一款在分布式架构环境中对应用配置进行集中管理和推送的应用配置中心产品。
- Alibaba Cloud OSS：阿里云对象存储服务（Object Storage Service，简称 OSS），是阿里云提供的云存储服务。
- Alibaba Cloud SchedulerX：阿里中间件团队开发的一款分布式任务调度产品，提供秒级、精准的定时（基于 Cron 表达式）任务调度服务。

#### 4、SpringCloud和SpringCloudAlibaba技术对比

https://blog.csdn.net/qq_41694906/article/details/126648458

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

