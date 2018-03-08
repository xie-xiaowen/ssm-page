package com.ydd.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ydd.util.Tools;

/**
 * 
 * @author Administrator
 * 创建时间：2017-11-8
 */
@SuppressWarnings("all")
@Repository("daoSupport")
public class DaoSupport implements Dao {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	/**
	 * 保存对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object save(String str, Object obj) throws Exception {
		return sqlSessionTemplate.insert(str, obj);
	}
	
	/**
	 * 批量保存对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object saveList(String str, List<Object> obj) throws Exception {
		return sqlSessionTemplate.insert(str, obj);
	}
	
	/**
	 * 修改对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object update(String str, Object obj) throws Exception {
		return sqlSessionTemplate.update(str, obj);
	}

	/**
	 * 批量修改对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public void updateList(String str, List obj) throws Exception {
	
		SqlSessionFactory sqlSessionFactory = sqlSessionTemplate.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
		
		try{
			
			if(!Tools.checkListIsNull(obj)){
				for (Object object : obj) {
					sqlSessionTemplate.update(str, object);
				}
				sqlSession.flushStatements();
				sqlSession.commit();
				sqlSession.clearCache();
			}
			
		}finally{
			sqlSession.close();
		}
		
	}
	
	
	/**
	 * 删除对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object delete(String str, Object obj) throws Exception {
		return sqlSessionTemplate.delete(str, obj);
	}
	
	/**
	 * 批量删除对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object deleteList(String str, List obj) throws Exception{
		return sqlSessionTemplate.delete(str, obj);
	}
	
	/**
	 * 查询单个对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findObject(String str, Object obj) throws Exception {
		return sqlSessionTemplate.selectOne(str, obj);
	}
	
	/**
	 * 查询多个对象
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findListObject(String str, Object obj) throws Exception {
		return sqlSessionTemplate.selectList(str, obj);
	}
	
}
