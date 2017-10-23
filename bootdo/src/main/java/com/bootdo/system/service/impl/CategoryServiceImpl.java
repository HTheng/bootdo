package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.CategoryDao;
import com.bootdo.system.domain.CategoryDO;
import com.bootdo.system.service.CategoryService;



@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public CategoryDO get(Integer categoryid){
		return categoryDao.get(categoryid);
	}
	
	@Override
	public List<CategoryDO> list(Map<String, Object> map){
		return categoryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return categoryDao.count(map);
	}
	
	@Override
	public int save(CategoryDO category){
		return categoryDao.save(category);
	}
	
	@Override
	public int update(CategoryDO category){
		return categoryDao.update(category);
	}
	
	@Override
	public int remove(Integer categoryid){
		return categoryDao.remove(categoryid);
	}
	
	@Override
	public int batchRemove(Integer[] categoryids){
		return categoryDao.batchRemove(categoryids);
	}
	
}
