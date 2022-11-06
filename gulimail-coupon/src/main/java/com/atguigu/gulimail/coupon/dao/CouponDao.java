package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author luoxu
 * @email 1137492123@qq.com
 * @date 2022-10-27 11:22:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
