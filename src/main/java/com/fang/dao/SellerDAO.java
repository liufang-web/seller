package com.fang.dao;

import com.fang.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:17
 */
public interface SellerDAO extends JpaRepository<Seller,Integer> {
}
