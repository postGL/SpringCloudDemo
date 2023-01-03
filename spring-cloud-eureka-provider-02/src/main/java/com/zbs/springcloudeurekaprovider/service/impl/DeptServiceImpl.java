package com.zbs.springcloudeurekaprovider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbs.springcloudeurekaprovider.db.entity.Dept;
import com.zbs.springcloudeurekaprovider.db.mapper.DeptMapper;
import com.zbs.springcloudeurekaprovider.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 * @author
 * @since 2022-12-22
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
