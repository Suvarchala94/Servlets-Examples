package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegSrv implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
	System.out.println("i am in init.....");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String pwd =req.getParameter("password");
		String mail =req.getParameter("email");
		String no=req.getParameter("mobileno");

		String no1=req.getParameter("dateofbirth");
		
		String gen=req.getParameter("gender");
		String country=req.getParameter("country");
		PrintWriter out=res.getWriter();
		Connection con=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","123456");
			PreparedStatement pstmt=con.prepareStatement("insert into registerdetails values(?,?,?,?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2,pwd );
			pstmt.setString(3,mail );
			pstmt.setString(4,no);
			pstmt.setString(5,no1);
			pstmt.setString(6, gen);
			pstmt.setString(7, country);
			pstmt.executeUpdate();
			out.print("Successfull");
		}catch(Exception e) {
			System.out.println("server is busy this time ....");
			System.out.println("try some other time");
			System.out.println(e.getMessage());
		}
		
		System.out.println("records inserted sucessfully");
		System.out.println("im in service");
		
	}

}
