package com.ydd.dao;

/**
 * 
 * @author Administrator
 * 创建时间：2017-11-8
 *
 */
public interface Dao {
	
	/**
	 * 保存对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object save(String str, Object obj) throws Exception;
	
	/**
	 * 修改对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object update(String str, Object obj) throws Exception;
	
	/**
	 * 删除对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object delete(String str, Object obj) throws Exception;
	
	/**
	 * 查询单个对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findObject(String str, Object obj) throws Exception;
	
	/**
	 * 查询多个对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findListObject(String str, Object obj) throws Exception;
}
