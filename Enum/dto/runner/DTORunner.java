package com.xworkz.enumerate.constant.dto.runner;

import com.xworkz.enumerate.constant.ProductType;
import com.xworkz.enumerate.constant.SeatType;
import com.xworkz.enumerate.constant.TicketType;
import com.xworkz.enumerate.constant.dto.CustomerDTO;
import com.xworkz.enumerate.constant.dto.TicketBookDTO;

public class DTORunner {

	public static void main(String[] args) {
		
		CustomerDTO customerDTO=new CustomerDTO("Gunashree","gunashreebayanna@gmail.com",ProductType.FOOTWEAR);
		double cost=customerDTO.getProductType().getCost();
		String productName=customerDTO.getProductType().getProductName();
		System.out.println(cost);
		System.out.println(productName);
		//System.out.println(customerDTO.getName());
		
		TicketBookDTO ticketBookDTO=new TicketBookDTO("Devara","GowriShankar",TicketType.ONLINE,SeatType.EXECUTIVE);
        TicketType tt=ticketBookDTO.getTicketType();
        double costOfTicket=tt.getCost();
        System.out.println(costOfTicket);
        TicketType[] tickets=TicketType.values();
        for(TicketType type:tickets)
        {
        	System.out.println(type+" "+type.getCost());
        }
        }

}
