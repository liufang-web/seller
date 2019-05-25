package com.fang.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 16:45
 */
@Entity
@Data
public class GoodRating {
    @Id
    @JSONField(serialize = false)
    private Integer rantingId;
    private String username;
    private String text;
    private Long rateTime;
    private Integer rateType;
    private Integer goodId;
    private String avatar;
}
