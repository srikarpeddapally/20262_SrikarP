package com.sonata.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.DAOimpl.LoginImpl;
import com.sonata.Model.Login;
@RestController
public class JdbcController {
	
		@Autowired
		private LoginImpl loginimpl;
		@GetMapping(value="/login")
		public List<Login>getEmp()
		{
			return loginimpl.getAllUsers();
		}
}