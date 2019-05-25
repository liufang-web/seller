package com.fang.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * create by RubyLiu
 * 2019/5/15 14:56
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class OrderMaster {
    @Id
    private String orderId;
    private Integer deskId;
    private BigDecimal orderAmount;
    @CreatedDate
    private Timestamp createTime;
}
