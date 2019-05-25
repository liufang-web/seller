package com.fang.service.impl;

import com.fang.dao.SellerSupportDAO;
import com.fang.entity.SellerSupport;
import com.fang.service.SupportService;
import com.fang.vo.SupportVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:14
 */
@Service
public class SupportServiceImpl implements SupportService {
    @Autowired
    private SellerSupportDAO sellerSupportDAO;
    @Override
    public List<SupportVO> getSupportList(Integer sellerId) {
        List<SellerSupport> sellerSupports = sellerSupportDAO.findBySellerId(sellerId);
        List<SupportVO> supportVOList  = new ArrayList<>();
        for (SellerSupport sellerSupport : sellerSupports){
            SupportVO supportVO = new SupportVO();
            supportVO.setType(sellerSupport.getType());
            supportVO.setDescription(sellerSupport.getDescription());
            supportVOList.add(supportVO);
        }
        return supportVOList;
    }
}
