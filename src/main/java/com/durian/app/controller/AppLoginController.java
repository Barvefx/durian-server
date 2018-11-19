package com.durian.app.controller;

import java.util.List;
import java.util.Map;

import com.durian.app.domian.UserDO;
import com.durian.app.service.AppUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.durian.common.utils.PageUtils;
import com.durian.common.utils.Query;
import com.durian.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-18 15:50:19
 */
 
@Controller
@RequestMapping("/app/user")
public class AppLoginController {
	@Autowired
	private AppUserService userService;
	
	@GetMapping()
	@RequiresPermissions("app:user:user")
	String User(){
	    return "app/user";
	}
	
	@ResponseBody
	@GetMapping("/lists")
	@RequiresPermissions("app:user:user")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UserDO> userList = userService.list(query);
		int total = userService.count(query);
		PageUtils pageUtils = new PageUtils(userList, total);
		return pageUtils;
	}
	
	@GetMapping("/adds")
	@RequiresPermissions("system:user:add")
	String add(){
	    return "system/user/add";
	}

	@GetMapping("/edits/{id}")
	@RequiresPermissions("system:user:edit")
	String edit(@PathVariable("id") String id,Model model){
		UserDO user = userService.get(id);
		model.addAttribute("user", user);
	    return "system/user/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/saves")
	@RequiresPermissions("system:user:add")
	public R save( UserDO user){
		if(userService.save(user)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/updates")
	@RequiresPermissions("system:user:edit")
	public R update( UserDO user){
		userService.update(user);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/removes")
	@ResponseBody
	@RequiresPermissions("system:user:remove")
	public R remove( String id){
		if(userService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemoves")
	@ResponseBody
	@RequiresPermissions("system:user:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		userService.batchRemove(ids);
		return R.ok();
	}
	
}
