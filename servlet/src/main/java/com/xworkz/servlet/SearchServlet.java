package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/emailsearch")
public class SearchServlet extends HttpServlet {
	
	public SearchServlet()
	{
		System.out.println("created SearchServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in SearchServlet");
		
		String email=req.getParameter("email");
		System.out.println("email:"+email);
	
		
		PrintWriter print=res.getWriter();
		print.print("search is success");
		
	}

}
