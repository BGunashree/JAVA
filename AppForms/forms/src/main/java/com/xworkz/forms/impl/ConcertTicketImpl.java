package com.xworkz.forms.impl;


import com.xworkz.forms.dto.ConcertTicketDTO;

import com.xworkz.forms.service.FormService;

public class ConcertTicketImpl implements FormService{

	@Override
	public boolean validation(Object obj)
	{
		boolean valid=true;
		if(obj!=null)
		{
			if(obj instanceof ConcertTicketDTO)
			{
				ConcertTicketDTO cdto=(ConcertTicketDTO)obj;
				String name=cdto.getArtistName();
				if(name!=null && name!=" "  && name.length()>3 && name.length()<50)
				{
					System.out.println("name is valid");
				}
				else {
					valid=false;
					System.err.println("name is invalid");
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
