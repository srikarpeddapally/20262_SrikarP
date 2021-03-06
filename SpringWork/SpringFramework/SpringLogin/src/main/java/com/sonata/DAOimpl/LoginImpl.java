package com.sonata.DAOimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.sonata.DAOIntf.LoginIntf;
import com.sonata.Model.Login;
import com.sonata.DBConnection.DbConnection;
@Service
public class LoginImpl implements LoginIntf{
	@Override
	public List<Login>getAllUsers()
	{
		List<Login>login=new ArrayList<>();
		try
		{
			DbConnection db=new DbConnection();
			PreparedStatement ps=db.getConnection().prepareStatement("select * from login");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String loginusername= rs.getString(1);
				String loginpassword =  rs.getString(2);
				Login login1 = new Login();
				login1.setUsername(loginusername);
				login1.setPassword(loginpassword);
				login.add(login1);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return login;
	}
}