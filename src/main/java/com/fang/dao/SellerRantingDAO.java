package com.fang.dao;

import com.fang.entity.SellerRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:18
 */
public interface SellerRantingDAO extends JpaRepository<SellerRating,Integer> {
    List<SellerRating> findBySellerId(Integer sellerId);
}
