package team.hyznrj.esgsmanager.test.service;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import team.hyznrj.esgsmanager.entity.Admin;
import team.hyznrj.esgsmanager.service.AdminService;

/**
 * 用于测试管理员接口实现类
 * @ClassName  AdminServiceTest 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月28日上午10:21:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@org.springframework.test.context.ContextConfiguration("classpath:spring/applicationContext.xml")
public class AdminServiceTest {
	
	@Resource
	private AdminService adminService;
	
	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindObjectById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindObjects() {
		List<Admin> list = adminService.findAllAdmin();
		System.out.println(list);
	}

	@Test
	public void testCreateAdmin() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAdminByAccounts() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAdminStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAdminByInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdminByAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllAdmin() {
		fail("Not yet implemented");
	}

}
