package com.fang.dao;

import com.fang.entity.GoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:16
 */
public interface GoodCategoryDAO extends JpaRepository<GoodCategory,Integer> {
    List<GoodCategory> findByCategoryId(Integer categoryId);
}
