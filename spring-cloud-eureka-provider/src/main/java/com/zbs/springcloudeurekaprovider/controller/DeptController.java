package com.zbs.springcloudeurekaprovider.controller;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.eureka.api.service.DeptFeignService;
import com.zbs.springcloudeurekaprovider.db.entity.Dept;
import com.zbs.springcloudeurekaprovider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 * @author
 * @since 2022-12-22
 */
@RestController
@RequestMapping("/dept")
public class DeptController implements DeptFeignService {

    @Autowired
    private IDeptService deptService;

    @Override
    @GetMapping("/queryList")
    public List<DeptDto> queryDeptList() {
        List<Dept> deptList = deptService.lambdaQuery().list();
        List<DeptDto> deptDtoList = deptList.stream().map(dept -> new DeptDto()
                .setDeptno(dept.getDeptno())
                .setDname(dept.getDname())
                .setDbSource(dept.getDbSource())).collect(Collectors.toList());
        return deptDtoList;
    }

}
