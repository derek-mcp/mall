package com.derek.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:36
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

