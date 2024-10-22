package com.xworkz.forms.dto;

public class CricketTicketDTO {
	
	private String groundName;
	private String customerName;
	private String email;
	private String seatType;
	private int noOfTickets;
	public CricketTicketDTO(String groundName, String customerName, String email, String seatType, int noOfTickets) {
		super();
		this.groundName = groundName;
		this.customerName = customerName;
		this.email = email;
		this.seatType = seatType;
		this.noOfTickets = noOfTickets;
	}
	@Override
	public String toString() {
		return "CricketTicketDTO [groundName=" + groundName + ", customerName=" + customerName + ", email=" + email
				+ ", seatType=" + seatType + ", noOfTickets=" + noOfTickets + "]";
	}
	public String getGroundName() {
		return groundName;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	

}
