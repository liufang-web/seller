package com.fang.dao;

import com.fang.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:16
 */
@Repository
public interface GoodDAO extends JpaRepository<Good,Integer> {
    @Query(value = "select * from good order by good_sell_count desc limit 10",nativeQuery = true)
    List<Good> findHotSell();
}
