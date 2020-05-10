package com.zhiwan.util;

import com.alibaba.fastjson.JSONObject;

public class Result {
    public static String Out(String msg,int code){
        JSONObject json=new JSONObject();
        json.put("msg",msg);
        json.put("resCode",code);
        return json.toJSONString();
    }
}
