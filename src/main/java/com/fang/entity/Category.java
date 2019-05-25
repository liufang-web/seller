package com.fang.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 16:45
 */
@Entity
@Data
public class Category {
    @Id
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
}
