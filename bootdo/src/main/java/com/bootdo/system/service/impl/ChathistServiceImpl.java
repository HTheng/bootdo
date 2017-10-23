package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ChathistDao;
import com.bootdo.system.domain.ChathistDO;
import com.bootdo.system.service.ChathistService;



@Service
public class ChathistServiceImpl implements ChathistService {
	@Autowired
	private ChathistDao chathistDao;
	
	@Override
	public ChathistDO get(Long id){
		return chathistDao.get(id);
	}
	
	@Override
	public List<ChathistDO> list(Map<String, Object> map){
		return chathistDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chathistDao.count(map);
	}
	
	@Override
	public int save(ChathistDO chathist){
		return chathistDao.save(chathist);
	}
	
	@Override
	public int update(ChathistDO chathist){
		return chathistDao.update(chathist);
	}
	
	@Override
	public int remove(Long id){
		return chathistDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return chathistDao.batchRemove(ids);
	}
	
}
