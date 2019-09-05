package com.shopping.demoapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.demoapp.bean.UserBean;
import com.shopping.demoapp.entity.User;
import com.shopping.demoapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	List<UserBean> list = new ArrayList<>();
	@PostMapping("/saveuser")
	public List<UserBean> saveUser(@RequestBody UserBean user) {
		list.add(user);
		return list;
	}
}
