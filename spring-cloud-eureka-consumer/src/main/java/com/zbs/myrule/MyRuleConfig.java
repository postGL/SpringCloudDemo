package com.zbs.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: MyRuleConfig
 * date: 2022/12/23 15:56
 * author: zhangbs
 * version: 1.0
 */

/**
 * 官方Ribbon解释：
 * 自定义Ribbon配置的负载均衡类，客户端RibbonConfiguration中已存在的组件与自定义CustomConfiguration中的任何组件组成（后者通常会覆盖前者）
 * 自定义的组件请注意 它不在|程序的上下文的ComponentScan中，所以要放在单独的不重叠的包中
 * 自己备注：
 * 放在启动类外边，可以自定哪个provider使用自定义的负载均衡规则，如果放在项目下边，被扫描到，就会是全局的，所有的provider都会采用统一个负载均衡规则
 */
@Configuration
public class MyRuleConfig {

    /**
     * 自定义Ribbon负载均衡规则
     * @return
     */
    @Bean
    public IRule myRule() {
        // 随机访问
        return new MyRule();
    }

}
