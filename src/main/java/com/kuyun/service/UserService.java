package com.kuyun.service;

import com.kuyun.entity.User;

public interface UserService {

	// 查询用户是否存在
	public User findUser(String userName, String password);

	// 修改头像
	public boolean queryImg(String userName, String picPath, String locPath);

}
