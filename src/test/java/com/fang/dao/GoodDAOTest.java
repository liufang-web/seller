package com.fang.dao;

import com.fang.entity.Good;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * create by LiuFang
 * 2019/5/15 16:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodDAOTest {
    @Autowired
    private GoodDAO goodDAO;

    @Test
    public void test1(){
        List<Good> goodList = goodDAO.findHotSell();
        Assert.assertNotEquals(0,goodList.size());
    }


}
