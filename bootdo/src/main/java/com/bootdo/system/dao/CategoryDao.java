package com.bootdo.system.dao;

import com.bootdo.system.domain.CategoryDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 产品类别
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface CategoryDao {

	CategoryDO get(Integer categoryid);
	
	List<CategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CategoryDO category);
	
	int update(CategoryDO category);
	
	int remove(Integer categoryID);
	
	int batchRemove(Integer[] categoryids);
}
