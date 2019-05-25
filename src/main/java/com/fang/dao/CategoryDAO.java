package com.fang.dao;

import com.fang.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:16
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
