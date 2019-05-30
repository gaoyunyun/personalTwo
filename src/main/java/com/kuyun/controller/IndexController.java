package com.kuyun.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kuyun.entity.Detail;
import com.kuyun.entity.User;
import com.kuyun.service.DetailService;
import com.kuyun.service.UserService;
import com.kuyun.tools.Constants;

@Controller
@RequestMapping(value = "/")
public class IndexController {

	@Resource
	private UserService userService;
	@Resource
	private DetailService detailService;

	// 个人中心界面显示
	@RequestMapping(value = "/")
	public String showUser(HttpSession session, Model model) {

		// 免登录处理->给予数据库用户表的一个账户和密码
		String userName = "yeyuqingcheng";
		String password = "123456";
		User user = userService.findUser(userName, password);
		// 将该用户账号保存为全局变量
		User administrator = new User();
		administrator.setId(user.getId());
		administrator.setUserName(user.getUserName());
		session.setAttribute(Constants.USER_SESSION, administrator);
		User userSession = (User) session.getAttribute(Constants.USER_SESSION);
		Detail detail=detailService.findDetail(userSession.getId());
		model.addAttribute("detail", detail);
		model.addAttribute("user", user);
		return "index";

	}

	// 修改头像
	@RequestMapping(value = "/queryImg", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> queryImg(HttpServletRequest request, HttpSession session,
			@RequestParam(value = "file", required = false) MultipartFile file) {
		String path = request.getServletContext().getRealPath("/") + "static\\uploads\\";
		File uploads = new File(path);
		// 如果文件夹不存在则创建
		if (!uploads.exists() && !uploads.isDirectory()) {
			uploads.mkdirs();
		}
		String locPath = "";
		String fileName = file.getOriginalFilename();
		File newfile = new File(path, fileName);
		try {
			file.transferTo(newfile);
			locPath = path + fileName;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 将文件上传的路径给user对象
		String picPath = "static/uploads/" + fileName;
		User userSession = (User) session.getAttribute(Constants.USER_SESSION);
		String userName = userSession.getUserName();
		boolean flag = userService.queryImg(userName, picPath, locPath);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (flag) {
			resultMap.put("result", "true");
		} else {
			resultMap.put("result", "false");
		}
		return resultMap;
	}

}
