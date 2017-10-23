package com.bootdo.system.service;

import com.bootdo.system.domain.PointaddDO;

import java.util.List;
import java.util.Map;

/**
 * 积分累计表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface PointaddService {
	
	PointaddDO get(Long id);
	
	List<PointaddDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PointaddDO pointadd);
	
	int update(PointaddDO pointadd);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
