package com.atguigu.gulimail.product.service;

import com.atguigu.gulimail.product.entity.SpuInfoDescEntity;
import com.atguigu.gulimail.product.vo.SupSaveVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author luoxu
 * @email 1137492123@qq.com
 * @date 2022-10-26 20:12:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SupSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

}

