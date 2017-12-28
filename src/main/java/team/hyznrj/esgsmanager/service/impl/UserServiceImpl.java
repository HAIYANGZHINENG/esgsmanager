package team.hyznrj.esgsmanager.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import team.hyznrj.esgsmanager.entity.Admin;
import team.hyznrj.esgsmanager.entity.AdminExample;
import team.hyznrj.esgsmanager.entity.User;
import team.hyznrj.esgsmanager.entity.UserExample;
import team.hyznrj.esgsmanager.mapper.UserMapper;
import team.hyznrj.esgsmanager.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public String save(User entity) {
		if(entity == null){
			return "0";
		}
		try {
			userMapper.updateByPrimaryKey(entity);
		} catch (Exception e) {
			// TODO: handle exception
			return "0";
		}
		return "1";
	}

	@Override
	public String update(User entity) {
		try {
			userMapper.updateByPrimaryKey(entity);
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
			UserExample example = new UserExample();
			example.createCriteria().andUseridEqualTo((Long)id);
			userMapper.deleteByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return id.toString();
		}
		return "true";
	}

	@Override
	public User findObjectById(Serializable id) {
		UserExample example = new UserExample();
		example.createCriteria().andUseridEqualTo((long)id);
		List<User> users = userMapper.selectByExample(example);
		User user = null;
		if(users == null || users.size() != 1){
			user = null;
		}else{
			user = users.get(0);
		}
		return user;
	}
	@Override
	public List<User> findObjects() {
		
		return userMapper.selectByExample(null);
	}

}
