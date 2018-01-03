package team.hyznrj.esgsmanager.service;

import java.util.List;

import team.hyznrj.esgsmanager.core.service.BaseService;
import team.hyznrj.esgsmanager.entity.Admin;

/**
 * 以下接口为管理员服务接口，用于对管理员实体的一些基本操作如CRUD。
 * 
 * @ClassName AdminService
 * @Description TODO
 * @author 何伟涛
 * @date 2017年12月27日下午3:13:47
 */
public interface AdminService extends BaseService<Admin> {

	/**
	 * 创建管理员
	 * <p>
	 * 前端传入新的管理员实体到服务后，服务对该管理员信息进行判断
	 * <p>
	 * 若信息不规范则返回"0"，若该信息已存在数据库，则返回"1",若数据保存成功，返回"2"
	 * 
	 * @param admin
	 *            控制层传入前端传过来的管理员实体信息
	 * @return 创建管理员信息的执行状态
	 */
	public String createAdmin(Admin admin);

	/**
	 * 根据管理员帐号删除管理员信息
	 * <p>
	 * 前端传入批量管理员帐号信息，根据帐号信息进行管理员批量删除
	 * <p>
	 * 返回删除失败的管理员信息
	 * 
	 * @param adminAccounts
	 *            管理员帐号列表
	 * @return 删除失败的管理员信息
	 */
	public List<Admin> deleteAdminByAccounts(List<Admin> adminAccounts);

	/**
	 * 编辑管理员帐号状态
	 * <p>
	 * 前端传入指定管理员信息和需要目的状态值，对该管理员的状态进行修改。
	 * <p>
	 * 若修改成功，返回"1",否则，返回"0"
	 * 
	 * @param admin
	 *            需要修改的管理员帐号
	 * @param status
	 *            目的状态值
	 * @return 返回修改帐号状态的执行状态
	 */
	public String updateAdminStatus(Admin admin, Integer status);

	/**
	 * 通过特定信息查询管理员信息
	 * <p>
	 * 前端传入管理员帐号状态值或权限到控制层，再由控制层传入该接口，
	 * <p>
	 * 该接口判断传入只是否为空而判断需要执行的查询语句
	 * 
	 * @param adminStatus
	 * @param adminJurisdiction
	 * @return 根据查询条件查询出来的管理员列表
	 */
	public List<Admin> findAdminByInfo(Integer adminStatus, String adminJurisdiction);

	/**
	 * 通过帐号查询管理员信息
	 * <p>
	 * 控制层输入前端用户输入的帐号到服务层，服务层判断输入值是否为空来执行相应的查询。
	 * 
	 * @param adminAccount
	 *            管理员帐号
	 * @return 返回查询得到的管理员信息
	 */
	public Admin getAdminByAccount(String adminAccount);

	/**
	 * 查询所有管理员信息
	 * 
	 * @return 返回所有管理员信息列表
	 */
	public List<Admin> findAllAdmin();

}
