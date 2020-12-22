package com.derek.mall.order.dao;

import com.derek.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:40:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
