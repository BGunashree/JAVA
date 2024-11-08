package com.xworkz.pasta.service;

import com.xworkz.pasta.dto.TicketDTO;
import com.xworkz.pasta.repository.TicketRepoImpl;
import com.xworkz.pasta.repository.TicketRepository;

public class TicketImpl implements TicketService{

	@Override
	public boolean validateAndSave(TicketDTO dto) {
		
		boolean valid=true;
		if(dto!=null)
		{
			String stadiumName=dto.getStadiumName();
			if(!stadiumName.isEmpty() && stadiumName.length()>6 && stadiumName.length()<50)
			{
				System.out.println("valid stadiumName");
			}
			else
			{
				valid=false;
				System.out.println("invalid stadiumName");
			}
			String email=dto.getEmail();
			if(!email.isEmpty() && email.contains("@")&& (email.endsWith(".in") || email.endsWith(".com")) )
			{
				System.out.println("valid email");
			}
			else
			{
				valid=false;
				System.out.println("invalid email");
			}
			String primarycontact=dto.getContact();
			if(!primarycontact.isEmpty() && primarycontact.length()==10)
			{
				System.out.println("valid primarycontact");
			}
			else
			{
				valid=false;
				System.out.println("invalid primarycontact");
			}
			
			int ticket=dto.getTickets();
			if(ticket>0 && ticket<10)
			{
				System.out.println("valid ticket");
			}
			else
			{
				valid=false;
				System.out.println("invalid ticket");
			}
		}
		if(valid)
		{
			TicketRepository ticketRepo=new TicketRepoImpl();
			int pk=ticketRepo.save(dto);
			if(pk>0)
			{
				System.out.println("data saved into db");
				return true;
				
			}
			else
			{
				System.out.println("data not saved into db");
				return false;
			}
			
			
		}
		return false;
	}
	
	

}
