package com.atguigu.common.constant;

/**
 * @author luoxu
 * @create 2022-11-03-17:52
 */
public class ProductConstant {

    public enum AttrEnum{
        ATTR_TYPE_BASE(1,"基本属性"),ATTR_TYPE_SQLE(0,"销售属性");
        private int code;
        private String msg;

        AttrEnum(int code,String msg){
            this.code = code;
            this.msg = msg;
        }

        public int getCode(){
            return code;
        }

        private String getMsg(){
            return msg;
        }
    }
}
