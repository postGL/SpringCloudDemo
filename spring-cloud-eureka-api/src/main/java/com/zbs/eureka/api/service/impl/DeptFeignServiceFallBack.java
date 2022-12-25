package com.zbs.eureka.api.service.impl;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.DeptFeignService;
import lombok.extern.slf4j.Slf4j;

/**
 * description: DeptFeignServiceFallBack
 * date: 2022/12/23 18:41
 * author: zhangbs
 * version: 1.0
 */
@Slf4j
public class DeptFeignServiceFallBack implements DeptFeignService {

    @Override
    public DeptDto queryById(int id) {
        log.error("服务降级Fallback，未查询到数据！！！");
        DeptDto deptDto = new DeptDto()
                .setDeptno(-1L)
                .setDname("服务降级Fallback，未找到该部门~");
        return deptDto;
    }
}
