package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCxtSample extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		}
	void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		ServletContext cxt=getServletContext();
		resp.setContentType("text/html");
		String driver=cxt.getInitParameter("dname");
		out.println("the value of dname is "+driver);
		ServletContext cxt1=getServletContext();
		cxt1.setAttribute("name","mighty");
		String name1=(String) cxt1.getAttribute("name");
		out.println("<br>"+"done through set attribute and get attribute "+name1);
		Enumeration <String> e=cxt1.getInitParameterNames();
		String m="";
		while(e.hasMoreElements()) {
			m=e.nextElement();
			out.println("<br>"+cxt1.getInitParameter(m));
		}
		out.println("<br>");
		String val=cxt.getInitParameter("location");
		out.println("this value occured through init param "+val);
		Class<? extends HttpServletResponse> value=resp.getClass();
		out.println("<br>"+"class is"+value);
		int status=resp.getStatus();
		out.println("<br>"+"the status is "+status);
		
		}
}
