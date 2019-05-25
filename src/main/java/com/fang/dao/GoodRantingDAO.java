package com.fang.dao;

import com.fang.entity.GoodRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:17
 */
public interface GoodRantingDAO extends JpaRepository<GoodRating,Integer> {
    List<GoodRating> findByGoodId(Integer goodId);
}
