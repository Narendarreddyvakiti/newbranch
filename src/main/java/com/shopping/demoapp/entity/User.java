package com.shopping.demoapp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usertbl")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "username")
	private String userName;
	
	@OneToMany(targetEntity = Address.class, mappedBy = "user")
	private List<Address> address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	
	
	
	

}
