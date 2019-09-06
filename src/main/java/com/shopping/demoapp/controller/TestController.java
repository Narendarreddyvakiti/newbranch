package com.shopping.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.demoapp.bean.Employee;
import com.shopping.demoapp.service.TestService;

@RestController
@RequestMapping(path = "/demoapp")
public class TestController {
	
	@Autowired(required=true)
	private TestService testService;
	

	@GetMapping(path = "/getemployeedetails")
	public List<Employee> getEmployeeDetails() {
		List<Employee> employee = testService.getEmployeesDetails();
		System.out.println("hello");
		return employee;
	}
}
