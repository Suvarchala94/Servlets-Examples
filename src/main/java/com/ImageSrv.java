package com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageSrv extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess( req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess( req, resp);
	}
	void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("image/jpeg");
		ServletOutputStream out=resp.getOutputStream();
		FileInputStream fis=new FileInputStream("D:\\suvarchala\\HTML\\images\\support.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new  FileOutputStream("out");
		int ch;
		while((ch=bis.read())!=-1) {
			fos.write(ch);
			}
		fos.close();
		bis.close();
		fis.close();
	}

	
	
}
