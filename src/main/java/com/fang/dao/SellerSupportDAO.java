package com.fang.dao;

import com.fang.entity.SellerSupport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:19
 */
public interface SellerSupportDAO extends JpaRepository<SellerSupport,Integer> {
    List<SellerSupport> findBySellerId(Integer sellerId);
}
