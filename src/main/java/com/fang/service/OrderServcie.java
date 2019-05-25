package com.fang.service;

import com.fang.dto.OrderDTO;
import com.fang.vo.ResutlVO;

/**
 * create by LiuFang
 * 2019/5/13 21:31
 */
public interface OrderServcie {

    ResutlVO createOrder(OrderDTO orderDTO);
}
