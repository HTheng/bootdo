package com.bootdo.system.service;

import com.bootdo.system.domain.UserinfoDO;

import java.util.List;
import java.util.Map;

/**
 * 用户收货地址信息表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface UserinfoService {
	
	UserinfoDO get(Integer infoid);
	
	List<UserinfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserinfoDO userinfo);
	
	int update(UserinfoDO userinfo);
	
	int remove(Integer infoid);
	
	int batchRemove(Integer[] infoids);
}
