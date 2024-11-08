package com.xworkz.pasta.dto;

public class TicketDTO {
	
	private String stadiumName;
	private int tickets;
	private String contact;
	private String email;
	public TicketDTO(String stadiumName, int tickets, String contact, String email) {
		super();
		this.stadiumName = stadiumName;
		this.tickets = tickets;
		this.contact = contact;
		this.email = email;
	}
	@Override
	public String toString() {
		return "TicketDTO [stadiumName=" + stadiumName + ", tickets=" + tickets + ", contact=" + contact + ", email="
				+ email + "]";
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public int getTickets() {
		return tickets;
	}
	public String getContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}

}
