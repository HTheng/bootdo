package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.RechargerecordDao;
import com.bootdo.system.domain.RechargerecordDO;
import com.bootdo.system.service.RechargerecordService;



@Service
public class RechargerecordServiceImpl implements RechargerecordService {
	@Autowired
	private RechargerecordDao rechargerecordDao;
	
	@Override
	public RechargerecordDO get(Long id){
		return rechargerecordDao.get(id);
	}
	
	@Override
	public List<RechargerecordDO> list(Map<String, Object> map){
		return rechargerecordDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return rechargerecordDao.count(map);
	}
	
	@Override
	public int save(RechargerecordDO rechargerecord){
		return rechargerecordDao.save(rechargerecord);
	}
	
	@Override
	public int update(RechargerecordDO rechargerecord){
		return rechargerecordDao.update(rechargerecord);
	}
	
	@Override
	public int remove(Long id){
		return rechargerecordDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return rechargerecordDao.batchRemove(ids);
	}
	
}
