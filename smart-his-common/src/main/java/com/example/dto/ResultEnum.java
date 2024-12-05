package com.example.dto;


public enum ResultEnum {

    SUCCESS("0000", "成功"),
    FAIL("0001", "失败"),
    COMMON_EXCEPTION("5", "系统异常"),

    FAIL_PARAM("1001", "请求参数错误"),
    FAIL_LOGIN("1002", "登录失败"),

    FAIL_ACCOUNT_EXIST("1004", "账号已存在"),
    FAIL_ACCOUNT_NOT_EXIST("1005", "账号不存在"),
    FILE_NOT_LOGIN("2001", "未登录"),
    FILE_NOT_HAVE_PERMISSION("2002", "没有权限"),
    FAIL_ACCOUNT_LOCK("2003", "账号已被锁定"),

    FAIL_HAVE_NOT_EXIST("3005", "数据不存在"),

    AREA_ORDER_EXIST("3006", "活动阵地被占用，不可预约"),

    WISH_STATE_ERROR("3007", "心愿状态不符"),
    ;




    String code;
    String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public static ResultEnum getByCode(String code) {
        if (code == null) {
            return COMMON_EXCEPTION;
        }
        for (ResultEnum outputEnum : ResultEnum.values()) {
            if (code.equals(outputEnum.code)) {
                return outputEnum;
            }
        }
        return COMMON_EXCEPTION;
    }
}
