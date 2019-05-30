package com.kuyun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuyun.entity.User;
import com.kuyun.mapper.UserMapper;
import com.kuyun.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	// 查询用户是否存在
	public User findUser(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			return userMapper.findUser(userName, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 修改头像
	public boolean queryImg(String userName, String picPath, String locPath) {
		try {
			return userMapper.queryImg(userName, picPath, locPath) >= 1 ? true : false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
