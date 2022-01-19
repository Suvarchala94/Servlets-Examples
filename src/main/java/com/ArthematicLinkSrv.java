package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArthematicLinkSrv extends HttpServlet {
	protected void get(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		process(req,res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		process(req,res);
	}
public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter out=res.getWriter();
	

	String num1=req.getParameter("num1");
	int n1=Integer.parseInt(num1);
	
	String num2=req.getParameter("number2");
	int n2=Integer.parseInt(num2);
	String str=req.getParameter("arthematic");
	res.setContentType("text/html");
	
		switch(str) {

		case "add":out.println("Arthematic Operations...");
					out.println("<br>");
				   out.println("addtion performed here");
				   out.println(n1+n2);
				   break;
		case "sub":out.println("Arthematic Operations...");
					out.println("sub performed here");
				   out.println(n1-n2);
				   break;
		case "mul":out.println("Arthematic Operations...");
					out.println("sub performed here");
				   out.println(n1*n2);
				   break;
		case "div":out.println("Arthematic Operations...");
					out.println("sub performed here");
				   out.println(n1/n2);
				   break;
		default:out.println("unable to get");
			}

}
}
