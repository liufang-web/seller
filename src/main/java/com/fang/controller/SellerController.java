package com.fang.controller;

import com.alibaba.fastjson.JSONObject;
import com.fang.dao.SellerDAO;
import com.fang.dao.SellerRantingDAO;
import com.fang.dto.OrderDTO;
import com.fang.entity.Seller;
import com.fang.entity.SellerRating;
import com.fang.service.OrderServcie;
import com.fang.service.PictureService;
import com.fang.service.SupportService;
import com.fang.service.GoodCategoryService;
import com.fang.until.Rating2RatingVO;
import com.fang.vo.GoodVO;
import com.fang.vo.ResutlVO;
import com.fang.vo.SellerRateVO;
import com.fang.vo.SellerVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 17:45
 */
@RestController
@RequestMapping("api")
public class SellerController {
    @Autowired
    private SellerDAO sellerDAO;
    @Autowired
    private SupportService supportService;
    @Autowired
    private PictureService pictureService;
    @Autowired
    private GoodCategoryService goodCategoryService;

    @Autowired
    private OrderServcie orderServcie;

    @Autowired
    private SellerRantingDAO rantingDAO;
    @RequestMapping("/seller")
    public ResutlVO getSeller(Integer sellerId){
        // 1. 赋值SellerVO
        Seller seller = sellerDAO.findById(sellerId).get();
        SellerVO sellerVO = new SellerVO();
        BeanUtils.copyProperties(seller,sellerVO);
        sellerVO.setSupports(supportService.getSupportList(sellerId));
        sellerVO.setPics(pictureService.getPicList(sellerId));
        // 2.将字符串转变为字符数组
        String temp = seller.getInfos();
        if (temp!=null && !"".equals(temp)) {
            List<String> infos = Arrays.asList(temp.split("#"));
            sellerVO.setInfos(infos);
        }
        return ResutlVO.ok(sellerVO);
    }
    @RequestMapping("/goods")
    public ResutlVO getGoodList(Integer sellerId){
       return ResutlVO.ok(goodCategoryService.getVOList(sellerId));
    }
    @RequestMapping("/ratings")
    public ResutlVO getRateList(Integer sellerId){
        List<SellerRating> rantings = rantingDAO.findBySellerId(sellerId);
        return  ResutlVO.ok(Rating2RatingVO.toView(rantings));
    }
    @PostMapping("/order")
    public ResutlVO createOrder(@RequestBody OrderDTO orderDTO){
        if (orderDTO.getDeskId() == null){
            return ResutlVO.error("桌号不能为空");
        }
        if (orderDTO.getFoodDTOList().size() == 0){
            return ResutlVO.error("商品不能为空");
        }
        return orderServcie.createOrder(orderDTO);
    }

}
