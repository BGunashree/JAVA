package com.xworkz.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xworkz.forms.dto.MovieTicketDTO;
import com.xworkz.forms.impl.MovieTicketImpl;
import com.xworkz.forms.service.FormService;

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
		System.out.println(dto);
		
		FormService service=new MovieTicketImpl();
		if(service.validation(dto))
		{
			System.out.println("booked ticket successfully");
		}
		else
		{
			System.err.println("not success");
		}
		
		
		

	}

}
