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
public class Seller {
    @Id
    private int sellerId;
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
    private String infos;
    private String pics;
}
