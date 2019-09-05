package com.shopping.demoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shopping.demoapp.bean.Employee;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public List<Employee> getEmployeesDetails() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Narendar", "Hyderabad"));
		employees.add(new Employee(102, "Abhishek", "Kolkata"));
		employees.add(new Employee(103, "Nargarjuna", "AP"));
		employees.add(new Employee(104, "Naresh", "Hyderabad"));
		
		return employees;
	}

}
