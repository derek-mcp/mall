package com.derek.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:06:31
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

