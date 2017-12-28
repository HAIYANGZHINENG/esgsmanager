package team.hyznrj.esgsmanager.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import team.hyznrj.esgsmanager.core.dao.BaseDao;

/**
 * 顶层Dao实现类
 * @ClassName  BaseDaoImpl 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午8:06:19
 * @param <T>
 */
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {

	
	
	@Override
	public void save(String statement, T entity) {
		this.getSqlSession().insert(statement,entity);
	}

	@Override
	public void update(String statement, T entity) {
		this.getSqlSession().update(statement,entity);
	}

	@Override
	public void delete(String statement, Serializable id) {
		this.getSqlSession().delete(statement, id);
	}

	@Override
	public T findObjectById(String statement, Serializable id) {
		return this.getSqlSession().selectOne(statement, id);
	}

	@Override
	public List<T> findObjects(String statement) {
		return this.getSqlSession().selectList(statement);
	}

	

}
