package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/register")
public class RegisterServlet extends HttpServlet {
	
	
	public RegisterServlet()
	{
		System.out.println("created RegisterServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in RegisterServlet");
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String password=req.getParameter("passkey");
		String confirmPassword=req.getParameter("cpass");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		String state=req.getParameter("state");
		String city=req.getParameter("city");
		
		System.out.println("first name:"+fname);
		System.out.println("last name:"+lname);
		System.out.println("email:"+email);
		System.out.println("mobile:"+mobile);
		System.out.println("password:"+password);
		System.out.println("confirm password:"+confirmPassword);
		System.out.println("gender:"+gender);
		System.out.println("country:"+country);
		System.out.println("state:"+state);
		System.out.println("city:"+city);
		
		PrintWriter print=res.getWriter();
		print.print("registration is success");
		
	}


}
