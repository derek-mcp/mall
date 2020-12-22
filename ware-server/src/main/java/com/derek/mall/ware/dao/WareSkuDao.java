package com.derek.mall.ware.dao;

import com.derek.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:52:35
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
