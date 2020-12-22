package com.derek.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:37
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

