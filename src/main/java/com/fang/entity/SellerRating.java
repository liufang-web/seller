package com.fang.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Value;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 16:45
 */
@Entity
@Data
public class SellerRating {
    @Id
    private Integer rantingId;
    private String username;
    private String rantingContent;
    private Long rateTime;
    private Integer sellerId;
    private Integer score;
    private Integer deliveryTime;
    private String recommend;
    private Integer rateType;

}
