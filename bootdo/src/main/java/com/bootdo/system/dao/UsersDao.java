package com.bootdo.system.dao;

import com.bootdo.system.domain.UsersDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户注册信息
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface UsersDao {

	UsersDO get(String userid);
	
	List<UsersDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UsersDO users);
	
	int update(UsersDO users);
	
	int remove(String userID);
	
	int batchRemove(String[] userids);
}
