package com.fang.dto;

import lombok.Data;

import java.util.List;

/**
 *
 * create by LiuFang
 * 2019/5/13 20:59
 */
@Data
public class OrderDTO {

    private Integer sellerId;
    private Integer deskId;
    private List<FoodDTO> foodDTOList;
}
