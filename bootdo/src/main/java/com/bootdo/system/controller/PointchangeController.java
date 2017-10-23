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

import com.bootdo.system.domain.PointchangeDO;
import com.bootdo.system.service.PointchangeService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 积分换取记录表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/pointchange")
public class PointchangeController {
	@Autowired
	private PointchangeService pointchangeService;
	
	@GetMapping()
	@RequiresPermissions("system:pointchange:pointchange")
	String Pointchange(){
	    return "system/pointchange/pointchange";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:pointchange:pointchange")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PointchangeDO> pointchangeList = pointchangeService.list(query);
		int total = pointchangeService.count(query);
		PageUtils pageUtils = new PageUtils(pointchangeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:pointchange:add")
	String add(){
	    return "system/pointchange/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:pointchange:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PointchangeDO pointchange = pointchangeService.get(id);
		model.addAttribute("pointchange", pointchange);
	    return "system/pointchange/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:pointchange:add")
	public R save( PointchangeDO pointchange){
		if(pointchangeService.save(pointchange)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:pointchange:edit")
	public R update( PointchangeDO pointchange){
		pointchangeService.update(pointchange);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:pointchange:remove")
	public R remove( Long id){
		if(pointchangeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:pointchange:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		pointchangeService.batchRemove(ids);
		return R.ok();
	}
	
}
