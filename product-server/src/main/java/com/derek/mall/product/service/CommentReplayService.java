package com.derek.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 13:01:36
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

