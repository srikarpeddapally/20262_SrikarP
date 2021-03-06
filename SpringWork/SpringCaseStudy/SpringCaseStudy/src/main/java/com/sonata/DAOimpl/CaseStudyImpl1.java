package com.sonata.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sonata.DAOIntf.CasestudyIntf;
import com.sonata.DBConnection.DbConnection;
import com.sonata.Model.Login;
import com.sonata.Model.Task;
import com.sonata.Model.User;

@Service
public class CaseStudyImpl1 implements CasestudyIntf {
	public List<Task> getAllTask(){
		List<Task> tasklist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from Task");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			Task task=new Task();
			task.setTask_ID(res.getInt("Task_ID"));
			task.setCreator_ID(res.getInt("Creator_ID"));
			task.setName(res.getString("Name"));
			task.setOwner_ID(res.getInt("Owner_ID"));
			task.setBookmarked(res.getString("Bookmarked"));
			task.setStatus(res.getString("Status"));
			task.setNotes(res.getString("Notes"));
			task.setCreated_On(res.getDate("Created_On"));
			task.setPriority(res.getString("Priority"));
			task.setDescription(res.getString("Description"));
			task.setStatus_Changed_On(res.getDate("Status_Changed_On"));
			tasklist.add(task);			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return tasklist;
	}
	
	public List<Login> getAllDetails(){
		List<Login> passlist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from login");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			Login task=new Login();
			task.setUsername(res.getString("username"));	
			task.setPassword(res.getString("password"));
			passlist.add(task);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return passlist;
		
	}
	
	public List<User> getAllUser(){
		List<User> userlist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from user");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			User task=new User();
			task.setUser_ID(res.getInt("User_ID"));
			task.setUsername(res.getString("Username"));
			task.setEmail(res.getString("Email"));
			task.setContact(res.getLong("Contact"));
			task.setRole(res.getString("Role"));
			task.setIsActive(res.getBoolean("IsActive"));
			task.setDOB(res.getDate("DOB"));
			task.setCreated_On(res.getDate("Created_On"));
			task.setPassword(res.getString("Password"));
			userlist.add(task);
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return userlist;
	}

	@Override
	public boolean addUser(User user) throws SQLException {
		boolean added = false;
		DbConnection conn = new DbConnection();
		String sql = "INSERT INTO User (User_ID,Username,Email,Contact,Role,IsActive,DOB,Created_On,) VALUES(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, user.getUser_ID());
		pst.setString(2,user.getUsername());
		pst.setString(3,user.getEmail());
		int r = pst.executeUpdate(); // insert, delete, update
		pst.close();
		conn.close();
		if (r > 0)
			added = true;
		return added;
	}
	

}