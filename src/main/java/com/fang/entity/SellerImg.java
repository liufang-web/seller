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
public class SellerImg {
    @Id
    private int picId;
    private String picStr;
    private Integer sellerId;
}
