package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileSrv  extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		req.getRequestDispatcher("loginapp.html").include(req, resp);
		HttpSession sec=req.getSession();
		if(sec!=null) {
			String name=(String) sec.getAttribute("name");
			out.println("welcome "+" name"+ " to this profile");
		}
		else {
			out.println("session expired..login once again");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		
	}

}
