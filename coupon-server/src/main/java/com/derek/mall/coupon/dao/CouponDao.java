package com.derek.mall.coupon.dao;

import com.derek.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:06:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
