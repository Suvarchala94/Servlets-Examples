package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MobileSrv implements Servlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name1=req.getParameter("person1");
		String name2=req.getParameter("person2");
		String name3=req.getParameter("person3");
		String no=req.getParameter("Mobile no");
		int n1=Integer.parseInt(no);
		String no1=req.getParameter("Mobile no2");
		int n2=Integer.parseInt(no1);
		String no2=req.getParameter("Mobile no3");
		int n3=Integer.parseInt(no2);
		PrintWriter out=res.getWriter();
		out.println("name of person1 is "+name1);
		out.println("the mobile no for person1 is"+n1);
		out.println("name of person2 is "+name2);
		out.println("the mobile no for person2 is"+n2);
		out.println("name of person1 is "+name3);
		out.println("the mobile no for person3 is"+n3);
		System.out.println("i am in service");
		
	}

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
		System.out.println("ia m in init");
		
	}

	

}
