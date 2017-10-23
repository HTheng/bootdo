package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.AdinfoDao;
import com.bootdo.system.domain.AdinfoDO;
import com.bootdo.system.service.AdinfoService;



@Service
public class AdinfoServiceImpl implements AdinfoService {
	@Autowired
	private AdinfoDao adinfoDao;
	
	@Override
	public AdinfoDO get(Integer id){
		return adinfoDao.get(id);
	}
	
	@Override
	public List<AdinfoDO> list(Map<String, Object> map){
		return adinfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return adinfoDao.count(map);
	}
	
	@Override
	public int save(AdinfoDO adinfo){
		return adinfoDao.save(adinfo);
	}
	
	@Override
	public int update(AdinfoDO adinfo){
		return adinfoDao.update(adinfo);
	}
	
	@Override
	public int remove(Integer id){
		return adinfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return adinfoDao.batchRemove(ids);
	}
	
}
