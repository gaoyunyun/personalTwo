package com.kuyun.entity;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 用户类
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 用户id
	private String userName;// 用户账号
	private String password;// 用户密码
	private Integer concern;// 用户关注
	private Integer fans;// 用户粉丝
	private Integer ccoin;// 用户c币
	private String picPath;// 头像项目路径
	private String locPath;// 头像本地路径

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName, String password, Integer concern, Integer fans, Integer ccoin,
			String picPath, String locPath) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.concern = concern;
		this.fans = fans;
		this.ccoin = ccoin;
		this.picPath = picPath;
		this.locPath = locPath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getConcern() {
		return concern;
	}

	public void setConcern(Integer concern) {
		this.concern = concern;
	}

	public Integer getFans() {
		return fans;
	}

	public void setFans(Integer fans) {
		this.fans = fans;
	}

	public Integer getCcoin() {
		return ccoin;
	}

	public void setCcoin(Integer ccoin) {
		this.ccoin = ccoin;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getLocPath() {
		return locPath;
	}

	public void setLocPath(String locPath) {
		this.locPath = locPath;
	}

}
