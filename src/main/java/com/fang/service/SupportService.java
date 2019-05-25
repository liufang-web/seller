package com.fang.service;

import com.fang.vo.SupportVO;

import java.util.List;

/**
 * @author liufangweb@163.com
 * @date 2019/4/15 21:11
 */
public interface SupportService {

    List<SupportVO> getSupportList(Integer sellerId);
}
