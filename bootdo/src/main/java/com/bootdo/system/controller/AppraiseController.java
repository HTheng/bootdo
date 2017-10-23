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

import com.bootdo.system.domain.AppraiseDO;
import com.bootdo.system.service.AppraiseService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 评价表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/appraise")
public class AppraiseController {
	@Autowired
	private AppraiseService appraiseService;
	
	@GetMapping()
	@RequiresPermissions("system:appraise:appraise")
	String Appraise(){
	    return "system/appraise/appraise";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:appraise:appraise")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AppraiseDO> appraiseList = appraiseService.list(query);
		int total = appraiseService.count(query);
		PageUtils pageUtils = new PageUtils(appraiseList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:appraise:add")
	String add(){
	    return "system/appraise/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:appraise:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		AppraiseDO appraise = appraiseService.get(id);
		model.addAttribute("appraise", appraise);
	    return "system/appraise/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:appraise:add")
	public R save( AppraiseDO appraise){
		if(appraiseService.save(appraise)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:appraise:edit")
	public R update( AppraiseDO appraise){
		appraiseService.update(appraise);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:appraise:remove")
	public R remove( Integer id){
		if(appraiseService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:appraise:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		appraiseService.batchRemove(ids);
		return R.ok();
	}
	
}
