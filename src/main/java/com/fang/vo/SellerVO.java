package com.fang.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fang.entity.SellerSupport;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:01
 */
@Data
public class SellerVO {
    private String name;
    private String description;
    private Integer deliveryTime;
    private BigDecimal score;
    private BigDecimal serviceScore;
    private BigDecimal foodScore;
    private BigDecimal rankRate;
    private BigDecimal minPrice;
    private Integer deliveryPrice;
    private Integer ratingCount;
    private Integer sellCount;
    private String bulletin;
    private String avatar;
    private List<SupportVO> supports;
    private List<String> pics;
    private List<String> infos;
}
