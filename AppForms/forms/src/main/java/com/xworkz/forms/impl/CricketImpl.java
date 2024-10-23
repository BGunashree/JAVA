package com.xworkz.forms.impl;


import com.xworkz.forms.dto.CricketTicketDTO;
import com.xworkz.forms.service.FormService;

public class CricketImpl  implements FormService {

	@Override
	public boolean validation(Object obj)
	{
		boolean valid=true;
		if(obj!=null)
		{
			if(obj instanceof CricketTicketDTO)
			{
				CricketTicketDTO cdto=(CricketTicketDTO)obj;
				String groundname=cdto.getGroundName();
				if(groundname!=null && groundname!=" "  && groundname.length()>3 && groundname.length()<50)
				{
					System.out.println("groundname is valid");
				}
				else {
					valid=false;
					System.err.println("groundname is invalid");
				}
				String name=cdto.getCustomerName();
				if(name!=null && name!=" "  && name.length()>3 && name.length()<50)
				{
					System.out.println("customer name is valid");
				}
				else {
					valid=false;
					System.err.println("customer name is invalid");
				}
				
				String email=cdto.getEmail();
				if(email!=null && email.contains("@") && email.endsWith(".com")) {
					
					System.out.println("email is valid");
					
				}
				else
				{
					valid=false;
					System.err.println("email is invalid");
				}
				
				int tickets=cdto.getNoOfTickets();
				if(tickets>0)
				{
					System.out.println("tickets is valid");
				}
				else
				{
					valid=false;
					System.err.println("tickets is invalid");
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
