package com.xworkz.pasta.repository;

import com.xworkz.pasta.dto.TicketDTO;

public class TicketRepoImpl implements TicketRepository{

	@Override
	public int save(TicketDTO ticketDTO) {
		System.out.println("running save in TicketRepo");
		return 1;
	}

}
