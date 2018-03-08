package com.ydd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ydd.base.BaseController;
import com.ydd.service.UserManagerService;
import com.ydd.util.SuperClass;

@Controller
@RequestMapping("/userManager")
public class UserManagerController extends BaseController{

	@Resource(name = "userManagerService")
	private UserManagerService service;
	
	@RequestMapping("/getUserList")
	public ModelAndView getUserList(){
		SuperClass sc = null;
		ModelAndView mav = null;
		
		try {
			sc = this.getSuperClass();
			mav = new ModelAndView("userManager");
			
			mav.addObject("user", service.getListUser(sc));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
}
