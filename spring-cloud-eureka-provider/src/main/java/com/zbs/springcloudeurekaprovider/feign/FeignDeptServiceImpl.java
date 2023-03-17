package com.zbs.springcloudeurekaprovider.feign;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.DeptFeignService;
import com.zbs.springcloudeurekaprovider.biz.DeptBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: FeignDeptServiceImpl
 * date: 2023/3/17 10:54
 * author: zhangbs
 * version: 1.0
 */
@Service
public class FeignDeptServiceImpl implements DeptFeignService {

    @Autowired
    private DeptBizService deptBizService;

    /**
     * DeptFeignService Feign调DeptProvider提供RestFul接口
     * 将@FeignClient的value和@GetMapping的value拼接成URL地址。http://EMP-PROVIDER//dept/queryById/{id}
     * 前提provider提供REST接口，provider不用实现service接口。
     * @param id
     * @return
     */
    @Override
    public DeptDto queryById(int id) {
        return deptBizService.queryById(id);
    }
}
