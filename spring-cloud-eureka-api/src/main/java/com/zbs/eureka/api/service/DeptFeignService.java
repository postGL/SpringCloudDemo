package com.zbs.eureka.api.service;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.impl.DeptFeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description: DeptFeginService
 * date: 2022/12/23 18:02
 * author: zhangbs
 * version: 1.0
 */

/**
 * FeignClient 除了fallback方式，还有fallbackFactory方式
 * 一、fallbackFactory 推荐：可以捕获异常信息并返回默认降级结果。可以打印堆栈信息。
 * 二、 fallback 不推荐:不能捕获异常打印堆栈信息，不利于问题排查。
 * https://blog.csdn.net/weixin_42771651/article/details/121626431
 * fallback和fallbackFactory都属于hystrix降级，降级是客户端发起判断的，在服务被主动断掉依然可以访问。
 */
@FeignClient(value = "EMP-PROVIDER", fallback = DeptFeignServiceFallBack.class, fallbackFactory = DeptFeignServiceFallBackFactory.class)
public interface DeptFeignService {

    /**
     * DeptFeignService Feign调DeptProvider提供RestFul接口
     * 将@FeignClient的value和@GetMapping的value拼接成URL地址。http://EMP-PROVIDER//dept/queryById/{id}
     * 前提provider提供REST接口，provider不用实现service接口。
     * @param id
     * @return
     */
    @GetMapping("/dept/queryById/{id}")
    DeptDto queryById(@PathVariable int id);

}
