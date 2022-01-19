package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleHttpSrv extends HttpServlet{

	
		
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		process(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		process(req, resp);
	}
private 	void process(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

		String name1=req.getParameter("person1");
		String name2=req.getParameter("person2");
		String name3=req.getParameter("person3");
		String no=req.getParameter("Mobile no");
		int n1=Integer.parseInt(no);
		String no1=req.getParameter("Mobile no2");
		int n2=Integer.parseInt(no1);
		String no2=req.getParameter("Mobile no3");
		int n3=Integer.parseInt(no2);
		PrintWriter out=resp.getWriter();
		out.println("name of person1 is "+name1);
		out.println("the mobile no for person1 is"+n1);
		out.println("name of person2 is "+name2);
		out.println("the mobile no for person2 is"+n2);
		out.println("name of person1 is "+name3);
		out.println("the mobile no for person3 is"+n3);
		System.out.println("i am in service");
		
		
		
		
		}

}
