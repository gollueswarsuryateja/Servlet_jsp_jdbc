package com.ltts.movieapplication.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.movieapplication.bo.MemberBo;
import com.ltts.movieapplication.model.Member;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
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
		System.out.println("I am POST METHOD");
		String email=request.getParameter("email");
		
		String name=request.getParameter("uname");
		
		String mobile=request.getParameter("mobile");
		
		int age=Integer.parseInt(request.getParameter("age"));
		
		String gender=request.getParameter("gender");
		Member m=new Member(email,name,mobile,gender,age);
		System.out.println(m);
		MemberBo mb=new MemberBo();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=mb.updateMember(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b==false) {
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			System.out.println("Value Successfully UPDATED ");
		}
		else {
			System.out.println("Some Error");
		}
	}

}
