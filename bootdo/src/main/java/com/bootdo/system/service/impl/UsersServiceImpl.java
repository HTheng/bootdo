package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.UsersDao;
import com.bootdo.system.domain.UsersDO;
import com.bootdo.system.service.UsersService;



@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDao usersDao;
	
	@Override
	public UsersDO get(String userid){
		return usersDao.get(userid);
	}
	
	@Override
	public List<UsersDO> list(Map<String, Object> map){
		return usersDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return usersDao.count(map);
	}
	
	@Override
	public int save(UsersDO users){
		return usersDao.save(users);
	}
	
	@Override
	public int update(UsersDO users){
		return usersDao.update(users);
	}
	
	@Override
	public int remove(String userid){
		return usersDao.remove(userid);
	}
	
	@Override
	public int batchRemove(String[] userids){
		return usersDao.batchRemove(userids);
	}
	
}
