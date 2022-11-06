package com.atguigu.common.execption;

/**
 * @author luoxu
 * @create 2022-11-01-16:56
 */

public enum BizCodeEnume {
    UNKNOW_EXECPTION(10000,"系统未知异常"),
    VAILD_EXECPTION(10001,"参数格式验证失败");

    private int code;
    private String msg;

    BizCodeEnume(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
