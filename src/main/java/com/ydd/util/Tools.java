package com.ydd.util;

import java.util.List;

/**
 * 
 * 工具类
 * @author Administrator
 * 创建时间：2017-11-8
 *
 */
@SuppressWarnings("all")
public class Tools {

	/**
	 * 判断 List 是否为 null 或 空值
	 * @param list
	 * @return true: 为null或空值，false：不为null并且不为空值
	 */
	public static boolean checkListIsNull(List list){
		if(list==null || list.size()==0 || list.get(0)==null){
			return true;
		}else{
			return false;
		}
	}
	
}
