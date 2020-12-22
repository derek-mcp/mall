package com.derek.mall.order.dao;

import com.derek.mall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:40:32
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
