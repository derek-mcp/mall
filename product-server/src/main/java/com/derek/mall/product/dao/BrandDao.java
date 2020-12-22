package com.derek.mall.product.dao;

import com.derek.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:37
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
