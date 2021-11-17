package com.ltts.movieapplicaton.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.ltts.movieapplicaton.model.Movie;

public class MovieBo {

	public boolean insertMovie(Movie m) throws Exception{
		
		boolean b=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root","Geswarsurya@123");
		Statement s=c.createStatement();
		b=s.execute("insert into movie values("+m.getMovieid()+",'"+m.getMoviename()+"','"+m.getDirector()+"','"+m.getHeroname()+"','"+m.getHeroine()+"',"+m.getReleasedate()+",'"+m.getLanguage()+"')");
		c.close();
		return b;
							
				
				
	}
	
}
