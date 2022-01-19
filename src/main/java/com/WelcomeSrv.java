package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeSrv extends HttpServlet {
	
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
	PrintWriter out=res.getWriter();	
	String name=req.getParameter("username");	
		out.println("welcome "+name);	
		
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("some interruption has occuried");
			System.out.println("try after some time..");

		}
	}
	
	
	

}
