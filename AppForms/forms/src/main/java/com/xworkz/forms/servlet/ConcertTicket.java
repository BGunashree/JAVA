package com.xworkz.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.forms.dto.ConcertTicketDTO;
import com.xworkz.forms.impl.ConcertTicketImpl;
import com.xworkz.forms.service.FormService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cbook")
public class ConcertTicket extends HttpServlet {
	
	
	public ConcertTicket() {
		System.out.println("Created ConcertTicket Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in ConcertTicket");

		String location = req.getParameter("location");
		String artistName = req.getParameter("name");
		String ticketType = req.getParameter("ttype");
		String totalTicket = req.getParameter("ticket");
		String preferenceType = req.getParameter("ptype");

		
		
		
		int totalTicketConverted=Integer.valueOf(totalTicket);
		
		ConcertTicketDTO dto=new ConcertTicketDTO(location,artistName,ticketType,totalTicketConverted,preferenceType);
		System.out.println(dto);
		
		FormService service=new ConcertTicketImpl();
		if(service.validation(dto))
		{
			System.out.println("booked successfully");
		}
		else
		{
			System.out.println("not success");
		}

	}

}
