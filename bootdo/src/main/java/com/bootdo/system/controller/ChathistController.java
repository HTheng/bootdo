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

import com.bootdo.system.domain.ChathistDO;
import com.bootdo.system.service.ChathistService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * IM聊天记录表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/chathist")
public class ChathistController {
	@Autowired
	private ChathistService chathistService;
	
	@GetMapping()
	@RequiresPermissions("system:chathist:chathist")
	String Chathist(){
	    return "system/chathist/chathist";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:chathist:chathist")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ChathistDO> chathistList = chathistService.list(query);
		int total = chathistService.count(query);
		PageUtils pageUtils = new PageUtils(chathistList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:chathist:add")
	String add(){
	    return "system/chathist/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:chathist:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ChathistDO chathist = chathistService.get(id);
		model.addAttribute("chathist", chathist);
	    return "system/chathist/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:chathist:add")
	public R save( ChathistDO chathist){
		if(chathistService.save(chathist)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:chathist:edit")
	public R update( ChathistDO chathist){
		chathistService.update(chathist);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:chathist:remove")
	public R remove( Long id){
		if(chathistService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:chathist:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		chathistService.batchRemove(ids);
		return R.ok();
	}
	
}
