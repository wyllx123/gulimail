package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author luoxu
 * @email 1137492123@qq.com
 * @date 2022-10-27 12:11:18
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
