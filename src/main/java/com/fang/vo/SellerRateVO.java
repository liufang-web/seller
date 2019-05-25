package com.fang.vo;

import lombok.Data;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/16 9:28
 */
@Data
public class SellerRateVO {
    private String username;
    private String text;
    private Long rateTime;
    private Integer score;
    private Integer deliveryTime;
    private List<String> recommend;
    private String avatar;
    private Integer rateType;
}
