package com.zihan.demo.utils;

import org.springframework.boot.json.GsonJsonParser;

/**
 * Created by zihanxu on 2017/9/13.
 */
public class JsonUtil {
    public static Object parseJson(String json) {
        GsonJsonParser gson = new GsonJsonParser();
        return gson.parseList(json);
    }
}
