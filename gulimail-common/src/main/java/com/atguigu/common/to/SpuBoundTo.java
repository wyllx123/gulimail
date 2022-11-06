package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author luoxu
 * @create 2022-11-05-21:41
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}
