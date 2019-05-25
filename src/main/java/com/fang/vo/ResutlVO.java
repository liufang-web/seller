package com.fang.vo;

import java.util.HashMap;

public class ResutlVO extends HashMap<String,Object> {
    private static final long serialVersionUID = 1L;
    private ResutlVO(){
        this.put("code",0);
    }
    private ResutlVO(Integer code,String message){
        this.put("code",code);
        this.put("error_msg",message);
    }
    public static ResutlVO ok(Object data){
        ResutlVO resutlVO = new ResutlVO();
        resutlVO.put("data",data);

        return  resutlVO;
    }
    public static ResutlVO error(String message){
        return new ResutlVO(1,message);
    }
}
