package com.shopping.demoapp.bean;

import java.util.List;

import com.shopping.demoapp.entity.Address;


	public class UserBean {
		private int userId;
		private String userName;
		private List<AddressBean> address;
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
		public List<AddressBean> getAddress() {
			return address;
		}
		public void setAddress(List<AddressBean> address) {
			this.address = address;
		}



	}
