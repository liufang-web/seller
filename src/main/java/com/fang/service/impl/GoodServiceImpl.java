package com.fang.service.impl;

import com.fang.dao.GoodDAO;
import com.fang.entity.Good;
import com.fang.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:44
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodDAO goodDAO;
    @Override
    public List<Good> getGoodList(Integer categoryId) {
        return null;
    }
}
