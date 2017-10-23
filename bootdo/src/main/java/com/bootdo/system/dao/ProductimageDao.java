package com.bootdo.system.dao;

import com.bootdo.system.domain.ProductimageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 产品图片表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface ProductimageDao {

	ProductimageDO get(Integer id);
	
	List<ProductimageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProductimageDO productimage);
	
	int update(ProductimageDO productimage);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
