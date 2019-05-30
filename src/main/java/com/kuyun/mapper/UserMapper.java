package com.kuyun.mapper;

import org.apache.ibatis.annotations.Param;

import com.kuyun.entity.User;

public interface UserMapper {

	// 查询用户是否存在
	User findUser(@Param(value = "userName") String userName, @Param(value = "password") String password)
			throws Exception;

	// 修改头像
	int queryImg(@Param(value = "userName") String userName, @Param(value = "picPath") String picPath,
			@Param(value = "locPath") String locPath) throws Exception;

}
