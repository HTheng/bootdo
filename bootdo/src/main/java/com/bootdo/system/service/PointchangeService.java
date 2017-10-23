package com.bootdo.system.service;

import com.bootdo.system.domain.PointchangeDO;

import java.util.List;
import java.util.Map;

/**
 * 积分换取记录表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface PointchangeService {
	
	PointchangeDO get(Long id);
	
	List<PointchangeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PointchangeDO pointchange);
	
	int update(PointchangeDO pointchange);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
