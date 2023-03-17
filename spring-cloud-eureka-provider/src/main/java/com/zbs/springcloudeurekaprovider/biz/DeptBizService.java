package com.zbs.springcloudeurekaprovider.biz;

import com.zbs.eureka.api.beans.DeptDto;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description: DeptBizService
 * date: 2023/3/17 10:57
 * author: zhangbs
 * version: 1.0
 */
public interface DeptBizService {

    DeptDto queryById(@PathVariable int id);

}
