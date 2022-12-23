package com.zbs.eureka.api.service;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.impl.DeptFeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * description: DeptFeginService
 * date: 2022/12/23 18:02
 * author: zhangbs
 * version: 1.0
 */
@FeignClient(value = "EMP-PROVIDER", fallback = DeptFeignServiceFallBack.class)
public interface DeptFeignService {

    @GetMapping("/dept/queryList")
    List<DeptDto> queryDeptList();

}
