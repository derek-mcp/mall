package com.derek.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:37
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

