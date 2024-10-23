package com.xworkz.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.forms.dto.CollegeAdmissionDTO;
import com.xworkz.forms.impl.AdmissionImpl;
import com.xworkz.forms.service.FormService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/admission")
public class CollegeAdmission extends HttpServlet {

	public CollegeAdmission() {
		System.out.println("Created CollegeAdmission Form");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in CollegeAdmission");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		String fatherName = req.getParameter("fatherName");
		String motherName = req.getParameter("motherName");
		String percentage = req.getParameter("percentage");
		String course = req.getParameter("course");
		String age = req.getParameter("age");
		
		long mobileConverted=Long.valueOf(mobile);
		double percentageConverted=Double.valueOf(percentage);
		int ageConverted=Integer.valueOf(age);
		
		CollegeAdmissionDTO dto=new CollegeAdmissionDTO(name,email,mobileConverted,address,fatherName,motherName,percentageConverted,course,ageConverted);
	    System.out.println(dto);
	    FormService service=new AdmissionImpl();
	   
	    
	    if( service.validation(dto))
	    {
	    	System.out.println("admission success");
	    }
	    else
	    {
	    	System.out.println("not success");
	    }
		
		
		
		

	}
}
