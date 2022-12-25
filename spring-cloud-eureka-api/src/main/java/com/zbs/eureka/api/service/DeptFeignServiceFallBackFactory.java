package com.zbs.eureka.api.service;

import com.zbs.eureka.api.beans.DeptDto;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * description: DeptFeignServiceFallBackFactory
 * date: 2022/12/25 17:04
 * author: zhangbs
 * version: 1.0
 */
@Component
@Slf4j
public class DeptFeignServiceFallBackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptFeignService() {
            @Override
            public DeptDto queryById(int id) {
                log.error("服务降级FallbackFactory，未查询到数据！！！");
                DeptDto deptDto = new DeptDto()
                        .setDeptno(-1L)
                        .setDname("服务降级FallbackFactory，未找到该部门~");
                return deptDto;
            }
        };
    }
}
