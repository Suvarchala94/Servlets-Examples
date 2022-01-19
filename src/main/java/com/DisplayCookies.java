package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayCookies extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		String name=req.getParameter("username");
		Cookie ck=new Cookie("uname", name);
		res.addCookie(ck);
		Cookie ck1=new Cookie("name", "vudutha");
		res.addCookie(ck1);
		ck1.setValue("cookie2");
		Cookie ck2=new Cookie("name", name);
		res.addCookie(ck2);
		ck2.setValue("cookie3");
		ck.setMaxAge(10000);
		out.println("max age of cookie1 is "+ck.getMaxAge());
		res.setContentType("text/html");
		//html code
		out.println("<form action='./display2'>");
		out.println("<input type='submit' value='submit'>");
	   }
}
