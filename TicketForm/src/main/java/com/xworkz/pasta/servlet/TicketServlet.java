package com.xworkz.pasta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.pasta.dto.TicketDTO;
import com.xworkz.pasta.service.TicketImpl;
import com.xworkz.pasta.service.TicketService;

@WebServlet(loadOnStartup=1,urlPatterns="/ticket")
public class TicketServlet extends HttpServlet {
	
	public TicketServlet() {
		System.out.println("no arg const of TicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in TicketServlet");

		String stadiumName = req.getParameter("sname");
		String tickets = req.getParameter("tickets");
		String primaryContact = req.getParameter("phone");
		String email = req.getParameter("email");
		

		int convertedTicket=Integer.parseInt(tickets);
		
		TicketService service = new TicketImpl();
		TicketDTO dto = new TicketDTO(stadiumName, convertedTicket, primaryContact, email);

		if (service.validateAndSave(dto)) {
			System.out.println("valid data");
			
			req.setAttribute("success", "Ticket booking successful");
			
			
		} else {
			System.out.println("invalid data");

			req.setAttribute("dto", dto);

			req.setAttribute("validationError", "ticket booking is failure");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/tickets.jsp");
		requestDispatcher.forward(req, res);
	}

}
