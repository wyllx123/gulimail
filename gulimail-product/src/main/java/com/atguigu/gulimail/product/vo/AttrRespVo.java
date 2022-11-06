package com.atguigu.gulimail.product.vo;

import lombok.Data;

/**
 * @author luoxu
 * @create 2022-11-03-14:53
 */
@Data
public class AttrRespVo extends Attrvo{

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
}
