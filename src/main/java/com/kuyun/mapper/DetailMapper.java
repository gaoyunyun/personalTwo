package com.kuyun.mapper;

import org.apache.ibatis.annotations.Param;

import com.kuyun.entity.Detail;

public interface DetailMapper {

	// 查询用户详细
	Detail findDetail(@Param(value = "userId") Integer userId) throws Exception;

}
