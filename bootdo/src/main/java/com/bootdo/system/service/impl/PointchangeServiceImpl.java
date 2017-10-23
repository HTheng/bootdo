package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.PointchangeDao;
import com.bootdo.system.domain.PointchangeDO;
import com.bootdo.system.service.PointchangeService;



@Service
public class PointchangeServiceImpl implements PointchangeService {
	@Autowired
	private PointchangeDao pointchangeDao;
	
	@Override
	public PointchangeDO get(Long id){
		return pointchangeDao.get(id);
	}
	
	@Override
	public List<PointchangeDO> list(Map<String, Object> map){
		return pointchangeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return pointchangeDao.count(map);
	}
	
	@Override
	public int save(PointchangeDO pointchange){
		return pointchangeDao.save(pointchange);
	}
	
	@Override
	public int update(PointchangeDO pointchange){
		return pointchangeDao.update(pointchange);
	}
	
	@Override
	public int remove(Long id){
		return pointchangeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return pointchangeDao.batchRemove(ids);
	}
	
}
