package com.xworkz.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xworkz.forms.dto.FeedBackDTO;
import com.xworkz.forms.impl.FeedBackImpl;
import com.xworkz.forms.service.FormService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/feedb")
public class FeedBack extends HttpServlet{
	
	public FeedBack() {
		System.out.println("Created FeedBack Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in FeedBack");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String comment = req.getParameter("comments");
		
		
		
		
		FeedBackDTO dto=new FeedBackDTO(name,email,comment);
		System.out.println(dto);
		FormService service=new FeedBackImpl();
		if(service.validation(dto))
		{
			System.out.println("feedback submitted successfully");
		}
		else
		{
			System.err.println("feedback not success");
		}
		

	}

}
