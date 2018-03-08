package com.ydd.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author Administrator
 * 创建时间：2017-11-8
 */
@SuppressWarnings("all")
public class SuperClass extends HashMap<Object, Object> implements Map<Object, Object>{
	
	private static final long serialVersionUID = -3669069935347356419L;
	
	Map<Object, Object> map = null;
	HttpServletRequest request = null;
	
	public SuperClass() {
		this.map = new HashMap<Object, Object>();
	}
	
	public SuperClass(HttpServletRequest request){
		this.request = request;
		
		this.map = new HashMap<Object, Object>();
		Map properties = request.getParameterMap();
		for (Object key : properties.keySet()) {
			this.map.put(key, properties.get(key));
		}
	}

	/**
	 * 根据key获取Object类型对象
	 */
	@Override
	public Object get(Object key) {
		return this.map.get(key);
	}
	
	/**
	 * 根据 key 获取String类型对象
	 * @param key
	 * @return
	 */
	public String getString(Object key){
		if(this.map.get(key) instanceof BigDecimal){
			return this.map.get(key).toString();
		}else{
			return (String) this.map.get(key);
		}
	}
	
	/**
	 * 向map中添加键值数据
	 */
	@Override
	public Object put(Object key, Object value) {
		return this.map.put(key, value);
	}
	
	/**
	 * 根据key删除
	 */
	@Override
	public Object remove(Object key) {
		return this.map.remove(key);
	}
	
	/**
	 * 判断map是否包含指定key
	 * true: 包含，false: 不包含
	 */
	@Override
	public boolean containsKey(Object key) {
		return this.map.containsKey(key);
	}
	
	/**
	 * 判断map是否包含指定value
	 */
	@Override
	public boolean containsValue(Object value) {
		return this.map.containsValue(value);
	}
	
	/**
	 * 将map转换为Set
	 */
	@Override
	public Set entrySet() {
		return this.map.entrySet();
	}
	
	/**
	 * 将一个map对象添加进map
	 */
	@Override
	public void putAll(Map m) {
		this.map.putAll(m);
	}
	
	/**
	 * 获取map大小
	 */
	@Override
	public int size() {
		return this.map.size();
	}
	
	/**
	 * 清空map
	 */
	@Override
	public void clear() {
		this.map.clear();
	}
	
	/**
	 * 获取map所有key
	 */
	@Override
	public Set<Object> keySet() {
		return this.map.keySet();
	}
	
	/**
	 * 判断map是否为空
	 */
	@Override
	public boolean isEmpty() {
		return this.map.isEmpty();
	}

	/**
	 * 获取map所有Valuse
	 */
	@Override
	public Collection<Object> values() {
		return this.map.values();
	}
	
	
}
