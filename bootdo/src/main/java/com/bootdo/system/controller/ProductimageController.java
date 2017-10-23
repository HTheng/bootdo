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

import com.bootdo.system.domain.ProductimageDO;
import com.bootdo.system.service.ProductimageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 产品图片表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/productimage")
public class ProductimageController {
	@Autowired
	private ProductimageService productimageService;
	
	@GetMapping()
	@RequiresPermissions("system:productimage:productimage")
	String Productimage(){
	    return "system/productimage/productimage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:productimage:productimage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ProductimageDO> productimageList = productimageService.list(query);
		int total = productimageService.count(query);
		PageUtils pageUtils = new PageUtils(productimageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:productimage:add")
	String add(){
	    return "system/productimage/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:productimage:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ProductimageDO productimage = productimageService.get(id);
		model.addAttribute("productimage", productimage);
	    return "system/productimage/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:productimage:add")
	public R save( ProductimageDO productimage){
		if(productimageService.save(productimage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:productimage:edit")
	public R update( ProductimageDO productimage){
		productimageService.update(productimage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:productimage:remove")
	public R remove( Integer id){
		if(productimageService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:productimage:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		productimageService.batchRemove(ids);
		return R.ok();
	}
	
}
