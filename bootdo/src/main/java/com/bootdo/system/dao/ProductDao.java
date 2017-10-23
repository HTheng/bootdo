package com.bootdo.system.dao;

import com.bootdo.system.domain.ProductDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 产品表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
@Mapper
public interface ProductDao {

	ProductDO get(Integer productid);
	
	List<ProductDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProductDO product);
	
	int update(ProductDO product);
	
	int remove(Integer productID);
	
	int batchRemove(Integer[] productids);
}
