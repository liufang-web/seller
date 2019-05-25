package com.fang.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 16:45
 */
@Entity
@Data
public class SellerSupport {
    @Id
    private int supportId;
    private Integer type;
    private String description;
    private Integer sellerId;
}
