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
		Admin admin = new Admin();
		admin.setAdminaccount("123456");
		admin.setAdminemail("13214@qq.com");
		admin.setAdminid(1L);
		admin.setAdminjurisdiction("普通管理员");
		admin.setAdminpassword("123456");
		admin.setAdminname("李梓濠");
		//admin.setAdminphone("13420122111");
		admin.setAdminstatus(1);
		System.out.println(adminService.update(admin));
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
