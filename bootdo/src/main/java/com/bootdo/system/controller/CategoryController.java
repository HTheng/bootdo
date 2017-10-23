package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.CategoryDO;
import com.bootdo.system.service.CategoryService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 产品类别
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping()
	@RequiresPermissions("system:category:category")
	String Category(){
	    return "system/category/category";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:category:category")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CategoryDO> categoryList = categoryService.list(query);
		int total = categoryService.count(query);
		PageUtils pageUtils = new PageUtils(categoryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:category:add")
	String add(){
	    return "system/category/add";
	}

	@GetMapping("/edit/{categoryid}")
	@RequiresPermissions("system:category:edit")
	String edit(@PathVariable("categoryid") Integer categoryid,Model model){
		CategoryDO category = categoryService.get(categoryid);
		model.addAttribute("category", category);
	    return "system/category/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:category:add")
	public R save( CategoryDO category){
		if(categoryService.save(category)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:category:edit")
	public R update( CategoryDO category){
		categoryService.update(category);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:category:remove")
	public R remove( Integer categoryid){
		if(categoryService.remove(categoryid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:category:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] categoryids){
		categoryService.batchRemove(categoryids);
		return R.ok();
	}
	
}
