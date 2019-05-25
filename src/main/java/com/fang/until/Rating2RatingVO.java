package com.fang.until;

import com.fang.entity.Seller;
import com.fang.entity.SellerRating;
import com.fang.vo.SellerRateVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/17 22:47
 */
public class Rating2RatingVO {
    public static List<SellerRateVO> toView(List<SellerRating> ratingList){
        List<SellerRateVO> rateVOList = new ArrayList<>();
        for (SellerRating rating : ratingList){
            SellerRateVO rateVO = new SellerRateVO();
            String recommend = rating.getRecommend();
            if (recommend!= null && !"".equals(recommend)) {
                String[] strings = recommend.split(",");
                rateVO.setRecommend(Arrays.asList(strings));
            }else {
                List<String> strings = new ArrayList<>();
                rateVO.setRecommend(strings);
            }
            rateVO.setRateType(rating.getRateType());
            rateVO.setAvatar("http://static.galileo.xiaojukeji.com/static/tms/default_header.png");
            rateVO.setDeliveryTime(rating.getDeliveryTime());
            rateVO.setText(rating.getRantingContent());
            rateVO.setRateTime(rating.getRateTime());
            rateVO.setScore(rating.getScore());
            rateVO.setUsername(rating.getUsername());
            rateVOList.add(rateVO);
        }
        return rateVOList;
    }
}
