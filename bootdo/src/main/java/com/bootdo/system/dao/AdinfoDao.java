package com.bootdo.system.dao;

import com.bootdo.system.domain.AdinfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 存储首页滚动图片表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface AdinfoDao {

	AdinfoDO get(Integer id);
	
	List<AdinfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdinfoDO adinfo);
	
	int update(AdinfoDO adinfo);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
