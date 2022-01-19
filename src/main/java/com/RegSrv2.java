package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegSrv2 extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String ed=req.getParameter("edu");
		Cookie ck4=new Cookie("edu",ed);
		resp.addCookie(ck4);
		String parent=req.getParameter("pd");
		Cookie ck5=new Cookie("pde",parent);
		resp.addCookie(ck5);
		Cookie ck6[]=req.getCookies();
		resp.setContentType("text/html");
		out.println("<h1>Form Details</h1>");
	for(int i=0;i<ck6.length;i++) {
		out.println("<br>"+ck6[i].getName()+"  "+ck6[i].getValue());
	}
		
			
	}

}
