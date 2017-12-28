package team.hyznrj.esgsmanager.core.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 定义数据库CRUD基础操作接口
 * 
 * @ClassName BaseDao
 * @Description TODO
 * @author 何伟涛
 * @date 2017年12月27日下午7:43:12
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 保存实体
	 * @param statement	命名空间.sqlId
	 * @param entity 实体参数
	 */
	public void save(String statement, T entity);

	/**
	 * 更新实体
	 * @param statement 命名空间.sqlId
	 * @param entity 实体参数
	 */
	public void update(String statement, T entity);

	/**
	 * 根据Id删除实体
	 * @param statement 命名空间.sqlId
	 * @param id 实体参数id
	 */
	public void delete(String statement, Serializable id);

	/**
	 * 通过id查找实体
	 * @param statement 命名空间.sqlId
	 * @param id 实体参数id
	 * @return
	 */
	public T findObjectById(String statement, Serializable id);

	/**
	 * 查找所有实体
	 * @param statement 命名空间.sqlId
	 * @return
	 */
	public List<T> findObjects(String statement);
}
