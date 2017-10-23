package com.bootdo.system.service;

import com.bootdo.system.domain.RechargerecordDO;

import java.util.List;
import java.util.Map;

/**
 * 充值记录表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface RechargerecordService {
	
	RechargerecordDO get(Long id);
	
	List<RechargerecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RechargerecordDO rechargerecord);
	
	int update(RechargerecordDO rechargerecord);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
