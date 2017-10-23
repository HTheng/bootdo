package com.bootdo.system.dao;

import com.bootdo.system.domain.UserinfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户收货地址信息表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface UserinfoDao {

	UserinfoDO get(Integer infoid);
	
	List<UserinfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserinfoDO userinfo);
	
	int update(UserinfoDO userinfo);
	
	int remove(Integer infoID);
	
	int batchRemove(Integer[] infoids);
}
