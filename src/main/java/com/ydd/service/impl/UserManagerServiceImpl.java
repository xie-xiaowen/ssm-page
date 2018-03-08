package com.ydd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ydd.dao.DaoSupport;
import com.ydd.service.UserManagerService;
import com.ydd.util.SuperClass;

@Service("userManagerService")
public class UserManagerServiceImpl implements UserManagerService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	@Override
	public List<Object> getListUser(SuperClass sc) throws Exception {
		return (List<Object>) dao.findListObject("UserManagerMapper.findList", sc);
	}
	
}
