package com.derek.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.derek.common.utils.PageUtils;
import com.derek.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:19:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

