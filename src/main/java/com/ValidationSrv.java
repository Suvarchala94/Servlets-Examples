package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationSrv extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		if(password.equals("hello")) {
			RequestDispatcher rd=req.getRequestDispatcher("Welcome2");
			rd.forward(req, res);
		}
		else {
			out.println("u entered incorrect details...");
			RequestDispatcher rd=req.getRequestDispatcher("/validate.html");
			rd.include(req, res);
			
		}
	}

}
