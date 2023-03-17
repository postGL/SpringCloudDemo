package com.zbs.springcloudeurekaprovider.biz.Impl;

import com.zbs.eureka.api.beans.DeptDto;
import com.zbs.springcloudeurekaprovider.biz.DeptBizService;
import com.zbs.springcloudeurekaprovider.db.entity.Dept;
import com.zbs.springcloudeurekaprovider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * description: DeptBizServiceImpl
 * date: 2023/3/17 10:58
 * author: zhangbs
 * version: 1.0
 */
@Service
public class DeptBizServiceImpl implements DeptBizService {

    @Autowired
    private IDeptService deptService;

    @Override
    public DeptDto queryById(int id) {
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

}
