package com.xworkz.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.forms.dto.CricketTicketDTO;


@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class CricketTicket extends HttpServlet{
	
	
	public CricketTicket() {
		System.out.println("Created CricketTicket Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in CricketTicket");

		String groundName = req.getParameter("name");
		String cusomerName = req.getParameter("cname");
		String email = req.getParameter("email");
		String seatType = req.getParameter("seat");
		String tickets = req.getParameter("ticket");
		
		
		
		
		
		int totalTicketConverted=Integer.valueOf(tickets);
		
		CricketTicketDTO dto=new CricketTicketDTO(groundName,cusomerName,email,seatType,totalTicketConverted);
		System.out.println("groundName: "+groundName);
		System.out.println("cusomerName: "+cusomerName);
		System.out.println("email: "+email);
		System.out.println("seatType: "+seatType);
		System.out.println("totalTicketConverted: "+totalTicketConverted);
	
		PrintWriter print=res.getWriter();
		print.print("order is success");
		

	}

}
