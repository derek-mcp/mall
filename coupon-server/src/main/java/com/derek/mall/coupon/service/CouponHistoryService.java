package com.derek.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:06:31
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

