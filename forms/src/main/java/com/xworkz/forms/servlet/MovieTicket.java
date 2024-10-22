package com.xworkz.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xworkz.forms.dto.MovieTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/book")
public class MovieTicket extends HttpServlet {
	
	
	
	public MovieTicket() {
		System.out.println("Created MovieTicket Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in MovieTicket");

		String name = req.getParameter("name");
		String totalTicket = req.getParameter("totalticket");
		String theater = req.getParameter("theater");
		String seatType = req.getParameter("seat");
		String donation = req.getParameter("donation");
		String date = req.getParameter("dates");
		String time = req.getParameter("timee");
		
		
		
		double donationConverted=Double.valueOf(donation);
		int totalTicketConverted=Integer.valueOf(totalTicket);
		
		MovieTicketDTO dto=new MovieTicketDTO(name,theater,donationConverted,date,time,totalTicketConverted,seatType);
		System.out.println("Name: "+name);
		System.out.println("totalTicket: "+totalTicketConverted);
		System.out.println("theater: "+theater);
		System.out.println("seatType: "+seatType);
		System.out.println("donation: "+donationConverted);
		System.out.println("date: "+date);
		System.out.println("time: "+time);
		
		PrintWriter print=res.getWriter();
		print.print("book is success");
		
		
		

	}

}
