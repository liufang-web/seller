package com.fang.vo;

import com.fang.entity.GoodRating;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:35
 */
@Data
public class FoodVO {
    private Integer foodId;
    private String name;
    private BigDecimal price;
    private String description;
    private Integer sellCount;
    private Integer rating;
    private String info;
    private String icon;
    private String image;
    List<GoodRating> ratings;
}
