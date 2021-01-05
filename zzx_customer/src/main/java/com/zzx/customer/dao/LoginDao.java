package com.zzx.customer.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {
	/**
	 * 根据用户名查询对应的用户
	 */
	JSONObject getUser(@Param("username") String username);
}
