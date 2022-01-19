package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecSrv1 extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String x=req.getParameter("fname");
		String y=req.getParameter("lname");
		String name=x.concat(y);
		String mail=req.getParameter("email");
		String no=req.getParameter("no");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String addr=req.getParameter("addr");
		HttpSession sec=req.getSession();
		sec.setAttribute("name",name);
		sec.setAttribute("email", mail);
		sec.setAttribute("no", no);
		sec.setAttribute("gender", gender);
		sec.setAttribute("dob", dob);
		sec.setAttribute("addr", addr);
		resp.setContentType("text/html");
		out.println("<form action='regform2.html'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
		out.println(1+2+"suvarchala"+2+1);
		
		
		
		
	}
	

}
