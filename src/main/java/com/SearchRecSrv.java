package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SearchRecSrv implements Servlet{

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
		System.out.println("i am from init");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String staffname=req.getParameter("Search Name");
		PrintWriter out=res.getWriter();
		Connection con=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","123456");
			Statement stmt=con.createStatement();
			String sql="select * from teacherrecords where name='"+staffname+"'";
			ResultSet rs=stmt.executeQuery(sql);
			boolean flag=false;
			while(rs.next()) {
				flag=true;
				String sname=rs.getString(1);
				int s=rs.getInt(2);
				int ex=rs.getInt(3);
				out.println("name is "+sname+" salary is "+s+" experience is"+ex);
				
				}
			if(flag==false)
				out.println("no records were found here");
			
			
		}catch(Exception e) {
			System.out.println("server busy thime");
		}
		
		
		
		
		
		
		
		
	}

}
