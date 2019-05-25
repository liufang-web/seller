package com.fang.dao;

import com.fang.entity.Seller;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liufangweb@163.com
 * @date 2019/4/16 21:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerDAOTest {
    @Autowired
    private SellerDAO sellerDAO;
    @Test
    public void getSeller(){
       Seller seller = sellerDAO.findById(1).get();
        Assert.assertNotNull(seller);
    }

}