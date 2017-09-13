package com.zihan.demo.utils;

import lombok.Getter;

/**
 * Created by zihanxu on 2017/9/13.
 */
@Getter
public enum CodeEnum {
    OK(200, "請求成功"),
    LOGIN_NEED(1, "未登入"),
    PRIVILEGE_NEED(2, "無權限"),
    PARAM_ILLEGAL(3, "參數非法"),
    DATA_NULL(4, "資料不存在"),
    OPERATE_ERROR(5, "操作失敗"),

    DATABASE_ERROR(11, "資料庫異常");

    private int code;
    private String msg;
    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
