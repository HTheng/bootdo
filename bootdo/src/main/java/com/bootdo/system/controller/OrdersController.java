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

import com.bootdo.system.domain.OrdersDO;
import com.bootdo.system.service.OrdersService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 订单表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
 
@Controller
@RequestMapping("/system/orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping()
	@RequiresPermissions("system:orders:orders")
	String Orders(){
	    return "system/orders/orders";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:orders:orders")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OrdersDO> ordersList = ordersService.list(query);
		int total = ordersService.count(query);
		PageUtils pageUtils = new PageUtils(ordersList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:orders:add")
	String add(){
	    return "system/orders/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:orders:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		OrdersDO orders = ordersService.get(id);
		model.addAttribute("orders", orders);
	    return "system/orders/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:orders:add")
	public R save( OrdersDO orders){
		if(ordersService.save(orders)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:orders:edit")
	public R update( OrdersDO orders){
		ordersService.update(orders);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:orders:remove")
	public R remove( Integer id){
		if(ordersService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:orders:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		ordersService.batchRemove(ids);
		return R.ok();
	}
	
}
