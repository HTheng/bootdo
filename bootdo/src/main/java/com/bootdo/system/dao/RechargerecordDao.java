package com.bootdo.system.dao;

import com.bootdo.system.domain.RechargerecordDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 充值记录表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface RechargerecordDao {

	RechargerecordDO get(Long id);
	
	List<RechargerecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RechargerecordDO rechargerecord);
	
	int update(RechargerecordDO rechargerecord);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
