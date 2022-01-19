package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegSrv1 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String name1=fname.concat(lname);
		Cookie ck=new Cookie("name",name1);
		resp.addCookie(ck);
		String mail=req.getParameter("email");
		Cookie ck1=new Cookie("email",mail);
		resp.addCookie(ck1);
		String mobileno=req.getParameter("no");
		Cookie ck12=new Cookie("mobileno",mobileno);
		resp.addCookie(ck12);		
		String gen=req.getParameter("gender");
		Cookie ck2=new Cookie("gender",gen);
		resp.addCookie(ck2);
		String dob=req.getParameter("dob");
		//int n=Integer.parseInt(dob);
		Cookie ck3=new Cookie("dob",dob);
		resp.addCookie(ck3);
		out.println("<form action='regform2.html'>");
		out.println("<input type='submit' value='next'>");
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
