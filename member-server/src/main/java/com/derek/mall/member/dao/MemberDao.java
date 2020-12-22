package com.derek.mall.member.dao;

import com.derek.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author derek
 * @email derek_mcp@163.com
 * @date 2020-12-22 15:19:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
