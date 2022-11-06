package com.atguigu.gulimail.product.service;

import com.atguigu.gulimail.product.vo.AttrGroupRelationVo;
import com.atguigu.gulimail.product.vo.AttrRespVo;
import com.atguigu.gulimail.product.vo.Attrvo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author luoxu
 * @email 1137492123@qq.com
 * @date 2022-10-26 20:12:36
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(Attrvo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(Attrvo attr);

    List<AttrEntity> getAttrRelation(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
}

