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

import com.bootdo.system.domain.AdinfoDO;
import com.bootdo.system.service.AdinfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 存储首页滚动图片表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/adinfo")
public class AdinfoController {
	@Autowired
	private AdinfoService adinfoService;
	
	@GetMapping()
	@RequiresPermissions("system:adinfo:adinfo")
	String Adinfo(){
	    return "system/adinfo/adinfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:adinfo:adinfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdinfoDO> adinfoList = adinfoService.list(query);
		int total = adinfoService.count(query);
		PageUtils pageUtils = new PageUtils(adinfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:adinfo:add")
	String add(){
	    return "system/adinfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:adinfo:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		AdinfoDO adinfo = adinfoService.get(id);
		model.addAttribute("adinfo", adinfo);
	    return "system/adinfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:adinfo:add")
	public R save( AdinfoDO adinfo){
		if(adinfoService.save(adinfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:adinfo:edit")
	public R update( AdinfoDO adinfo){
		adinfoService.update(adinfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:adinfo:remove")
	public R remove( Integer id){
		if(adinfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:adinfo:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		adinfoService.batchRemove(ids);
		return R.ok();
	}
	
}
