package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author luoxu
 * @email 1137492123@qq.com
 * @date 2022-10-26 20:12:36
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
