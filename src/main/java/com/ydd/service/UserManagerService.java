package com.ydd.service;

import java.util.List;

import com.ydd.util.SuperClass;

public interface UserManagerService {

	/**
	 * 查询所有用户数据
	 * @return
	 * @throws Exception
	 */
	public List<Object> getListUser(SuperClass sc) throws Exception ;
	
}
