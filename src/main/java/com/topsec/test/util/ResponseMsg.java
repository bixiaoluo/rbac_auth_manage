package com.topsec.test.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiyujing on 2017/11/9.
 * 统一返回前端响应实体
 */
public class ResponseMsg {

    public static Map createMsg(int code,String msg,Object data){
        Map res = new HashMap();
        res.put("code",code);//1: 成功,-1:失败
        res.put("msg",msg); //错误信息
        res.put("data",data);//结果
        return res;
    }
}
