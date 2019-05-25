package com.fang.service.impl;

import com.fang.dao.CategoryDAO;
import com.fang.dao.GoodCategoryDAO;
import com.fang.dao.GoodDAO;
import com.fang.dao.GoodRantingDAO;
import com.fang.entity.Category;
import com.fang.entity.Good;
import com.fang.entity.GoodCategory;
import com.fang.service.GoodCategoryService;
import com.fang.vo.FoodVO;
import com.fang.vo.GoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:47
 */
@Service
public class GoodCategoryServiceImpl implements GoodCategoryService {
    @Autowired
    private GoodCategoryDAO goodCategoryDAO;
    @Autowired
    private GoodDAO goodDAO;
    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private GoodRantingDAO rantingDAO;

    @Override
    public List<GoodVO> getVOList(Integer sellerId) {
        List<Category> CategoryList = categoryDAO.findAll();
        List<GoodVO> goodVOList = new ArrayList<>();
        for (Category category : CategoryList) {
            GoodVO goodVO = new GoodVO();
            goodVO.setName(category.getCategoryName());
            goodVO.setType(category.getCategoryType());
            // List<FoodVO>
            List<FoodVO> foodVOList = new ArrayList<>();
            List<GoodCategory> goodCategoryList = goodCategoryDAO.findByCategoryId(category.getCategoryId());
            for (GoodCategory goodCategory : goodCategoryList) {
                Good good = goodDAO.findById(goodCategory.getGoodId()).get();
                foodVOList.add(toView(good));
            }
            goodVO.setFoods(foodVOList);
            goodVOList.add(goodVO);
        }
        // 将销量前10的数据存入热销榜
        goodVOList.remove(0);
        GoodVO goodVO = new GoodVO();
        goodVO.setName("热销榜");
        goodVO.setType(-1);
        List<Good> goodList = goodDAO.findHotSell();
        List<FoodVO> foodVOList = new ArrayList<>();
        for (Good good : goodList){
            foodVOList.add(toView(good));
        }
        goodVO.setFoods(foodVOList);
        goodVOList.add(goodVO);
        return goodVOList;
    }

    @Override
    public FoodVO toView(Good good) {
        FoodVO foodVO = new FoodVO();
        foodVO.setFoodId(good.getGoodId());
        foodVO.setDescription(good.getGoodDec());
        foodVO.setIcon(good.getGoodIcon());
        foodVO.setImage(good.getGoodImage());
        foodVO.setInfo(good.getGoodInfo());
        foodVO.setName(good.getGoodName());
        foodVO.setPrice(good.getGoodPrice());
        foodVO.setSellCount(good.getGoodSellCount());
        foodVO.setRating(good.getGoodRating());
        foodVO.setRatings(rantingDAO.findByGoodId(good.getGoodId()));
        return foodVO;
    }
}
