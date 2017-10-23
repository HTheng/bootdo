package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.PointaddDao;
import com.bootdo.system.domain.PointaddDO;
import com.bootdo.system.service.PointaddService;



@Service
public class PointaddServiceImpl implements PointaddService {
	@Autowired
	private PointaddDao pointaddDao;
	
	@Override
	public PointaddDO get(Long id){
		return pointaddDao.get(id);
	}
	
	@Override
	public List<PointaddDO> list(Map<String, Object> map){
		return pointaddDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return pointaddDao.count(map);
	}
	
	@Override
	public int save(PointaddDO pointadd){
		return pointaddDao.save(pointadd);
	}
	
	@Override
	public int update(PointaddDO pointadd){
		return pointaddDao.update(pointadd);
	}
	
	@Override
	public int remove(Long id){
		return pointaddDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return pointaddDao.batchRemove(ids);
	}
	
}
