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

public class StaffSrv  implements Servlet{

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
		System.out.println("i am in init");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String name=req.getParameter("Name");
	String sala=req.getParameter("Salary");
	int sal=Integer.parseInt(sala);
	String expe=req.getParameter("Experience");
	int exp	=Integer.parseInt(sala);
	PrintWriter out=res.getWriter();
	Connection con=null;
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","123456");
		PreparedStatement pstmt=con.prepareStatement("insert into teacherrecords values(?,?,?)");
		pstmt.setString(1, name);
		pstmt.setInt(2, sal);
		pstmt.setInt(3, exp);
		pstmt.executeUpdate();
		out.println("records inserted sucessfully");
		}catch(Exception e) {
		System.out.println("sorry!server is busy");
		System.out.println(e.getMessage());
	}
	
	
	
		
	}

}
