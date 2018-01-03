package team.hyznrj.esgsmanager.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import team.hyznrj.esgsmanager.entity.Admin;
import team.hyznrj.esgsmanager.entity.AdminExample;
import team.hyznrj.esgsmanager.mapper.AdminMapper;
import team.hyznrj.esgsmanager.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {

    @Resource
	AdminMapper adminMapper;
	
	@Override
	public String save(Admin entity) {
		
		try{
			adminMapper.insert(entity);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "0";
		}
		return "2";
	}

	@Override
	public String update(Admin entity) {
		try {
			adminMapper.updateByPrimaryKey(entity);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "0";
		}
		return "1";
	}

	@Override
	public String delete(Serializable id) {
		try {
			AdminExample example = new AdminExample();
			example.createCriteria().andAdminaccountEqualTo(id.toString());
			adminMapper.deleteByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return id.toString();
		}
		return "true";
	}
	

	@Override
	public Admin findObjectById(Serializable id) {
		AdminExample example = new AdminExample();
		example.createCriteria().andAdminaccountEqualTo(id.toString());
		List<Admin> admins = adminMapper.selectByExample(example);
		Admin admin = null;
		if(admins == null || admins.size() != 1){
			admin = null;
		}else{
			admin = admins.get(0);
		}
		return admin;
	}

	@Override
	public List<Admin> findObjects() {
		System.out.println(adminMapper);
		return adminMapper.selectByExample(new AdminExample());
	}

	@Override
	public String createAdmin(Admin admin) {
		return save(admin);
	}

	@Override
	public List<Admin> deleteAdminByAccounts(List<Admin> adminAccounts) {
		if(adminAccounts == null || adminAccounts.size() == 0){
			return null;
		}			
		List<Admin> failedAdmin = new ArrayList<>();
		for(Admin admin :adminAccounts){
			if(!delete((Serializable)admin).equals("true")){
				failedAdmin.add(admin);
			}
		}
		return failedAdmin;
	}

	@Override
	public String updateAdminStatus(Admin admin, Integer status) {
		if(admin == null || status == null){
			return null;
		}
		try {
			admin.setAdminstatus(status);
			adminMapper.updateByPrimaryKey(admin);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "0";
		}
		return "1";
	}

	@Override
	public List<Admin> findAdminByInfo(Integer adminStatus, String adminJurisdiction) {
		AdminExample example = new AdminExample();
		if(adminJurisdiction != null){
			example.createCriteria().andAdminjurisdictionEqualTo(adminJurisdiction);
		}
		if(adminStatus != null){
			example.createCriteria().andAdminstatusEqualTo(adminStatus);
		}
		return adminMapper.selectByExample(example);
	}

	@Override
	public Admin getAdminByAccount(String adminAccount) {
		if(adminAccount == null){
			return null;
		}
		AdminExample example = new AdminExample();
		example.createCriteria().andAdminaccountEqualTo(adminAccount);
		List<Admin> list = adminMapper.selectByExample(example);
		if(list == null || list.size()!=1){
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<Admin> findAllAdmin() {
		
		return this.findObjects();
	}

	

}
