package com.bootdo.system.service;

import com.bootdo.system.domain.ProductDO;

import java.util.List;
import java.util.Map;

/**
 * 产品表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public interface ProductService {
	
	ProductDO get(Integer productid);
	
	List<ProductDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProductDO product);
	
	int update(ProductDO product);
	
	int remove(Integer productid);
	
	int batchRemove(Integer[] productids);
}
