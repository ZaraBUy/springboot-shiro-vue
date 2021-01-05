package com.zzx.customer.service;

import com.alibaba.fastjson.JSONObject;

public interface LoginService {
	/**
	 * 登录表单提交
	 */
	JSONObject authLogin(JSONObject jsonObject);

	/**
	 * 根据用户名
	 *
	 * @param username 用户名
	 */
	JSONObject getUser(String username);

	/**
	 * 查询当前登录用户的权限等信息
	 */
	JSONObject getInfo();

	/**
	 * 退出登录
	 */
	JSONObject logout();
}
