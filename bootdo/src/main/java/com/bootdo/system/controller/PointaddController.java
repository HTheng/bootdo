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

import com.bootdo.system.domain.PointaddDO;
import com.bootdo.system.service.PointaddService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 积分累计表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/pointadd")
public class PointaddController {
	@Autowired
	private PointaddService pointaddService;
	
	@GetMapping()
	@RequiresPermissions("system:pointadd:pointadd")
	String Pointadd(){
	    return "system/pointadd/pointadd";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:pointadd:pointadd")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PointaddDO> pointaddList = pointaddService.list(query);
		int total = pointaddService.count(query);
		PageUtils pageUtils = new PageUtils(pointaddList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:pointadd:add")
	String add(){
	    return "system/pointadd/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:pointadd:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PointaddDO pointadd = pointaddService.get(id);
		model.addAttribute("pointadd", pointadd);
	    return "system/pointadd/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:pointadd:add")
	public R save( PointaddDO pointadd){
		if(pointaddService.save(pointadd)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:pointadd:edit")
	public R update( PointaddDO pointadd){
		pointaddService.update(pointadd);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:pointadd:remove")
	public R remove( Long id){
		if(pointaddService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:pointadd:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		pointaddService.batchRemove(ids);
		return R.ok();
	}
	
}
