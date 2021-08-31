package com.sonata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.Model.Employee;

@RestController
//CrossOrigin(origins = "http:/localhost:3000")
//@RequestMapping("/api/v1")
public class JdbcController {
	
	@Autowired
	private EmployeeImpl empService;
	
	@GetMapping(value = "/employee")
	public List<Employee> getEmp(){
		return empService.getAllEmployee();
	}
	
	

}
