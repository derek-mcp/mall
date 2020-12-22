package com.derek.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:19:03
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

