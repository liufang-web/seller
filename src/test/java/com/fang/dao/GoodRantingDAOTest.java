package com.fang.dao;

import com.fang.entity.GoodRating;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liufangweb@163.com
 * @date 2019/4/16 21:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodRantingDAOTest {
    @Autowired
    private GoodRantingDAO goodRantingDAO;
    @Test
    public void getTest(){
       List<GoodRating> goodRatingList = goodRantingDAO.findByGoodId(1);
        Assert.assertNotEquals(0,goodRatingList.size());
    }

}