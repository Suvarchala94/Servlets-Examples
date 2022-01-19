package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArthematicSrv extends HttpServlet{
	protected void get(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		process(req,res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		process(req,res);
	}
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		try {
			String num1=req.getParameter("num1");
	int n1=Integer.parseInt(num1);
	String num2=req.getParameter("number2");
	int n2=Integer.parseInt(num2);
	String str=req.getParameter("arthematic");
	res.setContentType("text/html");
	if(str.equals("add")) {
		int sum=n1+n2;
		out.println("the addition of two numbers is "+sum);
	}else if(str.equals("sub")) {
		int sub=n1-n2;
		out.println("the substraction of two numbers is "+sub);
	}
	
	else if(str.equals("mul")) {
	int mul=n1*n2;
		out.println("the multiplication of two numbers is "+mul);
	}
	else if(str.equals("div")) {
	int div=n1/n2;
	out.println("the division of two numbers is "+div);
		}

	
	}catch(NumberFormatException e) {
	out.println("enter numbers only...");
	}
}
}
