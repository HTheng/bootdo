package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ProductimageDao;
import com.bootdo.system.domain.ProductimageDO;
import com.bootdo.system.service.ProductimageService;



@Service
public class ProductimageServiceImpl implements ProductimageService {
	@Autowired
	private ProductimageDao productimageDao;
	
	@Override
	public ProductimageDO get(Integer id){
		return productimageDao.get(id);
	}
	
	@Override
	public List<ProductimageDO> list(Map<String, Object> map){
		return productimageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return productimageDao.count(map);
	}
	
	@Override
	public int save(ProductimageDO productimage){
		return productimageDao.save(productimage);
	}
	
	@Override
	public int update(ProductimageDO productimage){
		return productimageDao.update(productimage);
	}
	
	@Override
	public int remove(Integer id){
		return productimageDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return productimageDao.batchRemove(ids);
	}
	
}
