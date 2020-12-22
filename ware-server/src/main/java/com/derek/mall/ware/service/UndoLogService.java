package com.derek.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:52:36
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

