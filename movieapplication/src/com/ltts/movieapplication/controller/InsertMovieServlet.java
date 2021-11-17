package com.ltts.movieapplication.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.movieapplication.bo.MovieBo;
import com.ltts.movieapplication.model.Movie;

/**
 * Servlet implementation class InsertMovieServlet
 */
//@WebServlet("/InsertMovieServlet")
public class InsertMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int mid=Integer.parseInt(request.getParameter("mid"));
		System.out.println(mid);
		String moviename=request.getParameter("mname");
		String dir=request.getParameter("dir");
		String hero=request.getParameter("hero");
		String heroine=request.getParameter("heroine");
		String lang=request.getParameter("language");
		Movie m=new Movie(mid,moviename,dir,hero,heroine,lang);
		MovieBo mb=new MovieBo();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=mb.insertMovie(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			b=true;
			e.printStackTrace();
			
		}
		if(b==false) {
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			System.out.println("Value Successfully inserted");
		}
		else {
			System.out.println("Some Error");
		}
	
		
	}

}
