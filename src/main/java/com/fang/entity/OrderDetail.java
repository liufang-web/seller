package com.fang.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * create by RubyLiu
 * 2019/5/15 14:56
 */
@Entity
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailId;
    private String orderId;
    private Integer productId;
    private String productName;
    private Integer productQuantity;
    private String productIcon;
}
