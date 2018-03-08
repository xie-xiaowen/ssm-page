package com.ydd.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ydd.util.SuperClass;

public class BaseController {

	/**
	 * 获取 Request 对象
	 * @return
	 */
	public HttpServletRequest getRequest(){
		return ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();
	}
	
	/**
	 * 获取SuperClass 对象
	 * @return
	 */
	public SuperClass getSuperClass(){
		return new SuperClass(this.getRequest());
	}
	
}
