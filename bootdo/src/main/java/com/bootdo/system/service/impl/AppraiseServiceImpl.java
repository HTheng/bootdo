package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.AppraiseDao;
import com.bootdo.system.domain.AppraiseDO;
import com.bootdo.system.service.AppraiseService;



@Service
public class AppraiseServiceImpl implements AppraiseService {
	@Autowired
	private AppraiseDao appraiseDao;
	
	@Override
	public AppraiseDO get(Integer id){
		return appraiseDao.get(id);
	}
	
	@Override
	public List<AppraiseDO> list(Map<String, Object> map){
		return appraiseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return appraiseDao.count(map);
	}
	
	@Override
	public int save(AppraiseDO appraise){
		return appraiseDao.save(appraise);
	}
	
	@Override
	public int update(AppraiseDO appraise){
		return appraiseDao.update(appraise);
	}
	
	@Override
	public int remove(Integer id){
		return appraiseDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return appraiseDao.batchRemove(ids);
	}
	
}
