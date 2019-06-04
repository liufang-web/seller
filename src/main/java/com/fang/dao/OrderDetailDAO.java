package com.fang.dao;

import com.fang.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * create by LiuFang
 * 2019/5/15 14:59
 */
public interface OrderDetailDAO extends JpaRepository<OrderDetail,Integer> {

}
