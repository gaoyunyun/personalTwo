package com.kuyun.entity;

import java.io.Serializable;

public class Detail implements Serializable {
	/**
	 * 详细类
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 个人id
	private Integer userId;// 用户id
	private String nickName;// 昵称
	private String realName;// 实名
	private String sex;// 性别
	private String birthday;// 生日
	private String region;// 地区
	private String industry;// 行业
	private String position;// 职位
	private String introduction;// 简介

	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detail(Integer id, Integer userId, String nickName, String realName, String sex, String birthday,
			String region, String industry, String position, String introduction) {
		super();
		this.id = id;
		this.userId = userId;
		this.nickName = nickName;
		this.realName = realName;
		this.sex = sex;
		this.birthday = birthday;
		this.region = region;
		this.industry = industry;
		this.position = position;
		this.introduction = introduction;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

}
