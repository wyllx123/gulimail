package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author luoxu
 * @email 1137492123@qq.com
 * @date 2022-10-27 12:11:18
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
