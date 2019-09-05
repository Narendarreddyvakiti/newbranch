package com.shopping.demoapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopping.demoapp.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	

}
