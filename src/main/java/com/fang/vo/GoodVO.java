package com.fang.vo;

import lombok.Data;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:43
 */
@Data
public class GoodVO {
    private String name;
    private Integer type;
    List<FoodVO> foods;
}
