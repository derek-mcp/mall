package com.derek.mall.ware.dao;

import com.derek.mall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:52:36
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
