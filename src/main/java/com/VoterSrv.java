package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VoterSrv implements Servlet {
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("i am init");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String name=req.getParameter("voter name");
		String no=req.getParameter("Age");
		int age=Integer.parseInt(no);
		PrintWriter out=res.getWriter();
		out.println("voter name is "+name);
		out.println("voter age is "+age);
		if(age>=18)
			out.println("the voter is eligible to vote...");
		else
			out.println("the voter is not eligible to vote");
		
		System.out.println("i am in service");
	}
	

}
