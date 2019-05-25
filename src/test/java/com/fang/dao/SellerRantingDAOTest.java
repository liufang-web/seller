package com.fang.dao;

import com.fang.entity.SellerRating;
import com.fang.until.Rating2RatingVO;
import com.fang.vo.SellerRateVO;
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
 * @date 2019/4/17 23:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerRantingDAOTest {
    @Autowired
    private SellerRantingDAO rantingDAO ;

    @Test
    public void test1(){
        List<SellerRating> rantings = rantingDAO.findBySellerId(1);
        List<SellerRateVO> rateVOList = Rating2RatingVO.toView(rantings);
        Assert.assertNotEquals(0,rateVOList.size());
    }


}