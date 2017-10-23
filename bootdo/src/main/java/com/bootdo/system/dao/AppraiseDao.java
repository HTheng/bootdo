package com.bootdo.system.dao;

import com.bootdo.system.domain.AppraiseDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 评价表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface AppraiseDao {

	AppraiseDO get(Integer id);
	
	List<AppraiseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AppraiseDO appraise);
	
	int update(AppraiseDO appraise);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
