package com.derek.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

