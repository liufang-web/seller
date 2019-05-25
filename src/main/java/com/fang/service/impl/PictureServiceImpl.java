package com.fang.service.impl;

import com.fang.dao.SellerImgDAO;
import com.fang.entity.SellerImg;
import com.fang.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:28
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private SellerImgDAO imgDAO;
    @Override
    public List<String> getPicList(Integer sellerId) {
        List<SellerImg> imgList =  imgDAO.findBySellerId(sellerId);
        List<String> picList = new ArrayList<>();
        for (SellerImg img : imgList){
            picList.add(img.getPicStr());
        }
        return picList;
    }
}
