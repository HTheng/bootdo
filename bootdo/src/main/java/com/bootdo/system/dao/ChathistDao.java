package com.bootdo.system.dao;

import com.bootdo.system.domain.ChathistDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * IM聊天记录表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface ChathistDao {

	ChathistDO get(Long id);
	
	List<ChathistDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChathistDO chathist);
	
	int update(ChathistDO chathist);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
