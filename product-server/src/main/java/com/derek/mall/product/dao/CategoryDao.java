package com.derek.mall.product.dao;

import com.derek.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
