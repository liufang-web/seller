package com.fang.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 16:45
 */
@Entity
@Data
public class Good {
    @Id
    private Integer goodId;
    private String goodName;
    private BigDecimal goodPrice;
    private String goodDec;
    private Integer goodSellCount;
    private Integer goodRating;
    private String goodInfo;
    private String goodIcon;
    private String goodImage;
}
