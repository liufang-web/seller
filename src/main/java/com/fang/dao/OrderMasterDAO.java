package com.fang.dao;

import com.fang.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * create by FangLiu
 * 2019/5/15 14:58
 */
public interface OrderMasterDAO extends JpaRepository<OrderMaster,String> {
}
