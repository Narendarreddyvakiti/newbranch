package com.shopping.demoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.demoapp.dao.UserDao;
import com.shopping.demoapp.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		User id = userDao.save(user);
		
		return false;
	}

}
