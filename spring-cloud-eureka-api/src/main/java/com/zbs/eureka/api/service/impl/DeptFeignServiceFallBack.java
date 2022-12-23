package com.zbs.eureka.api.service.impl;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.DeptFeignService;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * description: DeptFeignServiceFallBack
 * date: 2022/12/23 18:41
 * author: zhangbs
 * version: 1.0
 */
@Slf4j
public class DeptFeignServiceFallBack implements DeptFeignService {

    @Override
    public List<DeptDto> queryDeptList() {
        List<DeptDto> deptDtoList = new ArrayList<>();
        log.error("未查询到数据");
        DeptDto deptDto = new DeptDto()
                .setDeptno(-1L)
                .setDname("未找到该部门~");
        deptDtoList.add(deptDto);
        return deptDtoList;
    }
}
