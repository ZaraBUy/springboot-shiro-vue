package com.zzx.customer.service;

import com.alibaba.fastjson.JSONObject;


public interface PermissionService {
	/**
	 * 查询某用户的 角色  菜单列表   权限列表
	 */
	JSONObject getUserPermission(String username);
}
