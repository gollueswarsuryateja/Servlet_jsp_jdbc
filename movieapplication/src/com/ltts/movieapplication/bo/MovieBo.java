package com.ltts.movieapplication.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.movieapplication.model.Movie;



public class MovieBo {
	
	public boolean insertMovie(Movie m)throws Exception{
		 boolean b=false;
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root", "root");
			//Step 3
			Statement stmt=c.createStatement();
		    //Insert statement
			//Step 4
		    b=stmt.execute("insert into movie values("+m.getMovieId()+", '"+m.getMovieName()+"', '"+m.getDirector()+"','"+m.getHeroName()+"','"+m.getHeroine()+"','"+m.getLanguage()+"')");
			c.close();		
			return b;
	}
    public List<Movie> getAllMovies()throws Exception{
    	Class.forName("com.mysql.jdbc.Driver");
      List<Movie> li=new ArrayList<Movie>();
		
		
		//Step 2
		 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root", "root");

		 //Step 3 & 4
		 PreparedStatement ps=c.prepareStatement("select * from movie");
		 
		 //Step 4.a
		 ResultSet rs=ps.executeQuery();
		 
		 while(rs.next()) {
			 li.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
		 }
		//Query will be select statement
		 c.close();
		return li;
	}

}
