package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class LoginDao {
	String url="jdbc:mysql://sql12.freemysqlhosting.net/sql12373822";
	String username="sql12373822";
	String password="HWDHdTwcgF";
	String query="SELECT * FROM Doctor; ";
	public boolean check(String uname,String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				return true;
			}
			String name=rs.getString("Name");
			System.out.println(name);
			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
