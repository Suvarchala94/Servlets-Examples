package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleCookie extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("username");
		out.println("this is from servlet1");
		out.println("user name is "+name);
		Cookie ck=new Cookie("uname",name);
		res.addCookie(ck);
	
		out.println("<form action='./servlet2'>");
		out.println("<input type='submit' value='go'>");
	  } 
}
