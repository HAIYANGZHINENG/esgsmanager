package team.hyznrj.esgsmanager.core.service;

import java.io.Serializable;
import java.util.List;

/**
 * 顶层服务接口
 * 
 * @ClassName BaseService
 * @Description TODO
 * @author 何伟涛
 * @date 2017年12月27日下午7:41:18
 * @param <T>
 */
public interface BaseService<T> {
	
	
	/**
	 * 将实体添加到数据库当中
	 * 
	 * @param entity
	 */
	public String save(T entity);

	/**
	 * 更新传入的实体
	 * @param entity
	 */
	public String update(T entity);

	/**
	 * 通过id删除实体
	 * @param id
	 */
	public String delete(Serializable id);

	/**
	 * 通过id查找实体
	 * @param id
	 * @return
	 */
	public T findObjectById(Serializable id);

	/**
	 * 查找所有实体
	 * @return
	 */
	public List<T> findObjects();
}
