package com.fang.service.impl;

import com.fang.dao.GoodDAO;
import com.fang.dao.OrderDetailDAO;
import com.fang.dao.OrderMasterDAO;
import com.fang.dao.SellerDAO;
import com.fang.dto.FoodDTO;
import com.fang.dto.OrderDTO;
import com.fang.entity.Good;
import com.fang.entity.OrderDetail;
import com.fang.entity.OrderMaster;
import com.fang.entity.Seller;
import com.fang.service.OrderServcie;
import com.fang.vo.ResutlVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * create by RubyLiu
 * 2019/5/13 21:41
 */
@Service
public class OrderServiceImpl implements OrderServcie {
    @Autowired
    private GoodDAO goodDAO;
    @Autowired
    private OrderDetailDAO detailDAO;
    @Autowired
    private SellerDAO sellerDAO;
    @Autowired
    private OrderMasterDAO orderMasterDAO;
    @Override
    public ResutlVO createOrder(OrderDTO orderDTO) {
        Integer deskId = orderDTO.getDeskId();
        List<FoodDTO> foodDTOList = orderDTO.getFoodDTOList();
        BigDecimal amount = new BigDecimal("0");
        BigDecimal manjian = new BigDecimal("28");
        String orderId = UUID.randomUUID().toString();
        for(FoodDTO foodDTO : foodDTOList){
            //1.传过来的good_id有
            if (!goodDAO.existsById(foodDTO.getGoodId())){
                return ResutlVO.error("不存在商品");
            }
            Good good = goodDAO.findById(foodDTO.getGoodId()).get();
            //2.生成订单详情
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderId(orderId);
            orderDetail.setProductId(good.getGoodId());
            orderDetail.setProductName(good.getGoodName());
            orderDetail.setProductIcon(good.getGoodIcon());
            orderDetail.setProductQuantity(foodDTO.getCount());
            amount = amount.add(good.getGoodPrice().multiply(new BigDecimal(foodDTO.getCount())));
            detailDAO.save(orderDetail);
            //3.good_sell_count 加上count的值
            good.setGoodSellCount(good.getGoodSellCount()+foodDTO.getCount());
            goodDAO.save(good);
        }
        //4.生成订单
        OrderMaster orderMaster = new OrderMaster();
        if(amount.compareTo(manjian) == 1){
            amount = amount.subtract(new BigDecimal("5"));
        }
        orderMaster.setOrderAmount(amount);
        orderMaster.setOrderId(orderId);
        orderMaster.setDeskId(deskId);
        Seller seller = sellerDAO.findById(orderDTO.getSellerId()).get();
        seller.setSellCount(seller.getSellCount()+1);
        sellerDAO.save(seller);
        //5.返回订单详情
        return ResutlVO.ok(orderMasterDAO.save(orderMaster));
    }
}
