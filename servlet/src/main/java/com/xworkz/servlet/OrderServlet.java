package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/order")
public class OrderServlet extends HttpServlet {
	
	
	public OrderServlet()
	{
		System.out.println("created OrderServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in OrderServlet");
		
		String customerName=req.getParameter("customer");
		String item=req.getParameter("item");
		String quantity=req.getParameter("quantities");
		int casted=Integer.parseInt(quantity);
		System.out.println("customerName:"+customerName);
		System.out.println("item:"+item);
		System.out.println("quantity:"+casted);
		
		PrintWriter print=res.getWriter();
		print.print("order is success");
		
	}

}
