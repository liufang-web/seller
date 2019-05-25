package com.fang.dao;

import com.fang.entity.SellerImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:17
 */
public interface SellerImgDAO extends JpaRepository<SellerImg,Integer>{
    List<SellerImg> findBySellerId(Integer sellerId);
}
