package com.sonata.DAOIntf;

import java.sql.SQLException;
import java.util.List;

import com.sonata.Model.Login;
import com.sonata.Model.Task;
import com.sonata.Model.User;

public interface CasestudyIntf {
	public List<User> getAllUser();
	public List<Task> getAllTask();
	public List<Login> getAllDetails();
	public boolean addUser(User user) throws SQLException;
}
