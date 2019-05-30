package com.kuyun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuyun.entity.Detail;
import com.kuyun.mapper.DetailMapper;
import com.kuyun.service.DetailService;

@Service
public class DetailServiceImpl implements DetailService {

	@Autowired
	private DetailMapper detailMapper;

	// 查询用户详细
	public Detail findDetail(Integer userId) {
		// TODO Auto-generated method stub
		try {
			return detailMapper.findDetail(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
