package com.zbs.springcloudeurekaprovider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.springcloudeurekaprovider.db.entity.Dept;
import com.zbs.springcloudeurekaprovider.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 * @author
 * @since 2022-12-22
 */
@Slf4j
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping("/queryById/{id}")
    @HystrixCommand(fallbackMethod = "getByIdFallBack")
    public DeptDto getById(@PathVariable int id) {
        //调用接口
        Dept dept = deptService.getById(id);
        if (ObjectUtils.isEmpty(dept)) {
            throw new RuntimeException("未找到该部门信息~");
        }
        DeptDto deptDto = new DeptDto()
                .setDeptno(dept.getDeptno())
                .setDname(dept.getDname())
                .setDbSource(dept.getDbSource());
        //返回结果
        return deptDto;
    }

    /**
     * @HystrixCommand(fallbackMethod = "getByIdFallBack")
     * Hystrix 熔断，熔断是服务器处理的，再找不到数据，或者出现异常的时候，能够返回信息。
     * @param id
     * @return
     */
    public DeptDto getByIdFallBack(int id) {
        log.error("未查询到数据！！！");
        DeptDto deptDto = new DeptDto()
                .setDeptno(-1L)
                .setDname("未找到该部门~");
        return deptDto;
    }

}
