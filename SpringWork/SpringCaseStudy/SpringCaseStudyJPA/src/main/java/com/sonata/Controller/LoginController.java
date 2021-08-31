package com.sonata.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Login;
import com.sonata.Repository.LoginRepository;

@RestController
public class LoginController {
	
	Optional<Login> l1;
	
	@Autowired
	private LoginRepository prepsoritory;
	
	@Autowired
	private LoginRepository prepository;
	
	
	@GetMapping("/login")
	public List<Login> getAllUsers()
	{
		return prepository.findAll();
	}
	
	@GetMapping(value= "/login/{id}")
	public ResponseEntity getuserById(@PathVariable(value="id") Long User_ID)
	{
		l1= prepository.findById(User_ID);
		return ResponseEntity.ok().body(l1);
	}
	@PostMapping(value = "/login")
	public Login saveProduct(@RequestBody Login user)
	{
		return prepository.save(user);
	}
	
	@PutMapping(value="/login/{id}")
	public ResponseEntity updateUser(@PathVariable(value="id") Long User_ID, @Valid @RequestBody Login pdata) {
		l1 = prepository.findById(User_ID);
		Login p2 = l1.get();
		p2.setUser_ID(pdata.getUser_ID());
		p2.setPassword(pdata.getPassword());
		Login updateUser = prepository.save(p2);
		return ResponseEntity.ok(updateUser);
	}
	
	@DeleteMapping(value="/login/{id}")
	public ResponseEntity deleteUser(@PathVariable(value="id")Long User_ID) {
		prepository.deleteById(User_ID);
		return ResponseEntity.noContent().build();
	}


	
	
}
