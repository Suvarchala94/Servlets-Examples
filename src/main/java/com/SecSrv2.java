package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecSrv2 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out=resp.getWriter();
		String edu=req.getParameter("edu");
		String pr=req.getParameter("pd");
		HttpSession sec=req.getSession();
		sec.setAttribute("edd",edu);
		sec.setAttribute("parent",pr);
		resp.setContentType("text/html");
		out.println("<form action='./secSrv3'>");
		out.println("<input type='submit' value='next'>");
		out.println("</form>");
		
	}


}
