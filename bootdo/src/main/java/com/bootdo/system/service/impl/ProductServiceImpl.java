package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ProductDao;
import com.bootdo.system.domain.ProductDO;
import com.bootdo.system.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	@Override
	public ProductDO get(Integer productid){
		return productDao.get(productid);
	}
	
	@Override
	public List<ProductDO> list(Map<String, Object> map){
		return productDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return productDao.count(map);
	}
	
	@Override
	public int save(ProductDO product){
		return productDao.save(product);
	}
	
	@Override
	public int update(ProductDO product){
		return productDao.update(product);
	}
	
	@Override
	public int remove(Integer productid){
		return productDao.remove(productid);
	}
	
	@Override
	public int batchRemove(Integer[] productids){
		return productDao.batchRemove(productids);
	}
	
}
