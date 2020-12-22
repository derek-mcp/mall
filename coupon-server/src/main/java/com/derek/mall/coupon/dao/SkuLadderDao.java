package com.derek.mall.coupon.dao;

import com.derek.mall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:06:30
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
