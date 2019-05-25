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
public class GoodCategory {
    @Id
    private Integer id;
    private Integer categoryId;
    private Integer goodId;
}
