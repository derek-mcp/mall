package com.derek.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:40:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

