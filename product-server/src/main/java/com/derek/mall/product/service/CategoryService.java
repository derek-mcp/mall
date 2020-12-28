package com.derek.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:37
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

