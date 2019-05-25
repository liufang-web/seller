package com.fang.service;

import com.fang.entity.Good;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:41
 */
public interface GoodService {
    List<Good> getGoodList(Integer categoryId);
}
