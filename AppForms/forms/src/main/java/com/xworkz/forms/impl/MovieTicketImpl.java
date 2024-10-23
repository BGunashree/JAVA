package com.xworkz.forms.impl;

import com.xworkz.forms.dto.CollegeAdmissionDTO;
import com.xworkz.forms.dto.MovieTicketDTO;
import com.xworkz.forms.service.FormService;

public class MovieTicketImpl implements FormService{

	@Override
	public boolean validation(Object obj)
	{
		boolean valid=true;
		if(obj!=null)
		{
			if(obj instanceof MovieTicketDTO)
			{
				MovieTicketDTO dto=(MovieTicketDTO)obj;
				String name=dto.getName();
				if(name!=null && name!=" "  && name.length()>3 && name.length()<50)
				{
					System.out.println("name is valid");
				}
				else {
					valid=false;
					System.out.println("name is invalid");
				}
				
				int noOfTicket=dto.getTotalTicket();
				if(noOfTicket>0)
				{
					System.out.println("ticket no is valid");
				}
				else
				{
					valid=false;
					System.out.println("ticket no is not valid");
				}
				
				String theaterName=dto.getTheaterName();
				if(theaterName!=null && theaterName!=" "  && theaterName.length()>3 && theaterName.length()<50) {
					
					System.out.println("theaterName is valid");
					
				}
				else
				{
					valid=false;
					System.out.println("theaterName is invalid");
				}
				
				
				
				
			}
		}
		
		if(valid)
		{
			return true;
		}
		return false;
	}
	

}
