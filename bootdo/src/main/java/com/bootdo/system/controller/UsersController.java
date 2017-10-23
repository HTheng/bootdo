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

import com.bootdo.system.domain.UsersDO;
import com.bootdo.system.service.UsersService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 用户注册信息
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/users")
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	@GetMapping()
	@RequiresPermissions("system:users:users")
	String Users(){
	    return "system/users/users";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:users:users")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UsersDO> usersList = usersService.list(query);
		int total = usersService.count(query);
		PageUtils pageUtils = new PageUtils(usersList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:users:add")
	String add(){
	    return "system/users/add";
	}

	@GetMapping("/edit/{userid}")
	@RequiresPermissions("system:users:edit")
	String edit(@PathVariable("userid") String userid,Model model){
		UsersDO users = usersService.get(userid);
		model.addAttribute("users", users);
	    return "system/users/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:users:add")
	public R save( UsersDO users){
		if(usersService.save(users)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:users:edit")
	public R update( UsersDO users){
		usersService.update(users);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:users:remove")
	public R remove( String userid){
		if(usersService.remove(userid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:users:batchRemove")
	public R remove(@RequestParam("ids[]") String[] userids){
		usersService.batchRemove(userids);
		return R.ok();
	}
	
}
