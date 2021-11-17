package com.ltts.movieapplication.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ltts.movieapplication.bo.MemberBo;
import com.ltts.movieapplication.model.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String uname=request.getParameter("email");
		String pass=request.getParameter("pass");
		MemberBo mb=new MemberBo();
		Member m=null;
		RequestDispatcher rd=null;
		HttpSession session=request.getSession();
		try {
			m=mb.getMemberByEmail(uname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(m==null) {
			rd=request.getRequestDispatcher("error.html");
			rd.include(request, response);
			
		}
		else {
			
			if(m.getEmail().equals(uname)) {
				if(m.getMobile().equals(pass)) {
					session.setAttribute("email", m.getEmail());
					session.setAttribute("name", m.getName());
					request.setAttribute("name", m.getName());
					request.setAttribute("email", m.getEmail());
					
					rd=request.getRequestDispatcher("welcome.jsp");
					rd.forward(request, response);
				}
				else {
					rd=request.getRequestDispatcher("error.html");
					rd.include(request, response);
				}
			}
			else {
				rd=request.getRequestDispatcher("error.html");
				rd.include(request, response);
			}
			
		}
		
	}

}
