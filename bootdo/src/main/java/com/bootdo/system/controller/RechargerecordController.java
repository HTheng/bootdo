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

import com.bootdo.system.domain.RechargerecordDO;
import com.bootdo.system.service.RechargerecordService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 充值记录表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/rechargerecord")
public class RechargerecordController {
	@Autowired
	private RechargerecordService rechargerecordService;
	
	@GetMapping()
	@RequiresPermissions("system:rechargerecord:rechargerecord")
	String Rechargerecord(){
	    return "system/rechargerecord/rechargerecord";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:rechargerecord:rechargerecord")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RechargerecordDO> rechargerecordList = rechargerecordService.list(query);
		int total = rechargerecordService.count(query);
		PageUtils pageUtils = new PageUtils(rechargerecordList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:rechargerecord:add")
	String add(){
	    return "system/rechargerecord/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:rechargerecord:edit")
	String edit(@PathVariable("id") Long id,Model model){
		RechargerecordDO rechargerecord = rechargerecordService.get(id);
		model.addAttribute("rechargerecord", rechargerecord);
	    return "system/rechargerecord/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:rechargerecord:add")
	public R save( RechargerecordDO rechargerecord){
		if(rechargerecordService.save(rechargerecord)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:rechargerecord:edit")
	public R update( RechargerecordDO rechargerecord){
		rechargerecordService.update(rechargerecord);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:rechargerecord:remove")
	public R remove( Long id){
		if(rechargerecordService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:rechargerecord:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		rechargerecordService.batchRemove(ids);
		return R.ok();
	}
	
}
