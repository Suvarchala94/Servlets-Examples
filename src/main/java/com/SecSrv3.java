package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecSrv3 extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession sec=req.getSession();
		resp.setContentType("text/html");
		out.println("Details of user:");
		
		out.println("name"+"    "+sec.getAttribute("name"));
		out.println("email"+"    "+sec.getAttribute("email"));
		out.println("mobile no"+"    "+sec.getAttribute("no"));
		out.println("gender"+"    "+sec.getAttribute("gender"));
		out.println("Dob:"+"    "+sec.getAttribute("dob"));
		out.println("Address"+"    "+sec.getAttribute("addr"));
		out.println("Eduction Details"+"    "+sec.getAttribute("edd"));
		out.println("email"+"    "+sec.getAttribute("pd"));
		
		
		
		
		
		
	}
	
	
	
	

}
