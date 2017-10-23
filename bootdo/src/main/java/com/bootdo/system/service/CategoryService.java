package com.bootdo.system.service;

import com.bootdo.system.domain.CategoryDO;

import java.util.List;
import java.util.Map;

/**
 * 产品类别
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface CategoryService {
	
	CategoryDO get(Integer categoryid);
	
	List<CategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CategoryDO category);
	
	int update(CategoryDO category);
	
	int remove(Integer categoryid);
	
	int batchRemove(Integer[] categoryids);
}
