package com.sonata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sonata.DAOimpl.CaseStudyImpl;
import com.sonata.DAOimpl.CaseStudyImpl1;
import com.sonata.Model.Login;
import com.sonata.Model.Task;
import com.sonata.Model.User;



@RestController
public class CaseStudyController {

	@Autowired
	private CaseStudyImpl1 taskService;
//	private CaseStudyImpl1 userService;
	
	@GetMapping(value="/task")
	public List<Task> getTask(){
		return taskService.getAllTask();
	}
	@GetMapping(value="/login")
	public List<Login> getLogin(){
		return taskService.getAllDetails();
	}
	@GetMapping(value="/test")
	public String test() {
		return "testing done!!!";
	}
	
	@GetMapping(value="/user")
	public List<User> getUser(){
		return taskService.getAllUser();
	}
	

}