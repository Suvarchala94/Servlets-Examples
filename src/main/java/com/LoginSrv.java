package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSrv extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		req.getRequestDispatcher("loginapp.html").include(req, resp);
		String name=req.getParameter("username");
		String pwd=req.getParameter("password");
		if(pwd.equals("admin123")) {
			out.println("hello user"+name);
			HttpSession sec=req.getSession();
			sec.setAttribute("uname", name);
			
		}
		else {
			out.println("wrong username or password");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		
		
		
	}

}
