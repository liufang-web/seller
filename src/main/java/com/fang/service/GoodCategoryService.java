package com.fang.service;

import com.fang.entity.Good;
import com.fang.vo.FoodVO;
import com.fang.vo.GoodVO;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:46
 */

public interface GoodCategoryService {
    List<GoodVO> getVOList(Integer sellerId);

    FoodVO toView(Good good);
}
