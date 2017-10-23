package com.bootdo.system.service;

import com.bootdo.system.domain.UsersDO;

import java.util.List;
import java.util.Map;

/**
 * 用户注册信息
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface UsersService {
	
	UsersDO get(String userid);
	
	List<UsersDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UsersDO users);
	
	int update(UsersDO users);
	
	int remove(String userid);
	
	int batchRemove(String[] userids);
}
