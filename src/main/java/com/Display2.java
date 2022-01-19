package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display2  extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		Cookie ck=new Cookie("uname","name");
		Cookie[] ck3=req.getCookies();
		for(int i=0;i<ck3.length;i++) {
			out.println("cookies are "+ck3[i].getName());
		}
		out.println("i am from servlet2");
		
		
	}













}
