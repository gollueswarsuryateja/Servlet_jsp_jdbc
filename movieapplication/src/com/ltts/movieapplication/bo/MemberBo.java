package com.ltts.movieapplication.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.ltts.movieapplication.model.Member;
import com.ltts.movieapplication.model.Movie;

public class MemberBo {

	public boolean insertMember(Member m)throws Exception{
	 boolean b=false;
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root", "root");
		//Step 3
		Statement stmt=c.createStatement();
	    //Insert statement
		//Step 4
	    b=stmt.execute("insert into member values('"+m.getEmail()+"', '"+m.getName()+"', '"+m.getMobile()+"','"+m.getGender()+"',"+m.getAge()+")");
		c.close();		
		return b;
	}
	
	public Member getMemberByEmail(String email)throws Exception{
		Member m=null;
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step 2
		 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root", "root");

		 //Step 3 & 4
		 PreparedStatement ps=c.prepareStatement("select * from member where email=?");
		 ps.setString(1, email);
		 
		 //Step 4.a
		 ResultSet rs=ps.executeQuery();
		 
		 while(rs.next()) {
			 m=new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
		 }
		 
		
			c.close();	
		return m;
		
	}
	
	public boolean updateMember(Member m)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root", "root");
		//Step 3
		Statement stmt=c.createStatement();
	    //Insert statement
		//Step 4
	  boolean b=stmt.execute("update member set name='"+m.getName()+"', mobile='"+m.getMobile()+"', gender='"+m.getGender()+"', age="+m.getAge()+" where email='"+m.getEmail()+"'");
		c.close();
		return false;
	}
	
}
