package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/contact")
public class ContactServlet extends HttpServlet{
	
	
	public ContactServlet()
	{
		System.out.println("created ContactServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in ContactServlet");
		
		String name=req.getParameter("cname");
		String email=req.getParameter("email");
		String phone=req.getParameter("mobile");
		String address=req.getParameter("address");
		
		System.out.println("name:"+name);
		System.out.println("emailid:"+email);
		System.out.println("phone:"+phone);
		System.out.println("phone:"+address);
		
		PrintWriter print=res.getWriter();
		print.print("contact is success");
		
	}

}
