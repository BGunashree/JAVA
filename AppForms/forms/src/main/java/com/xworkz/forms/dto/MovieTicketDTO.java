package com.xworkz.forms.dto;

public class MovieTicketDTO {

	
	private String name;
	private String theaterName;
	private double donation;
	private String date;
	private String time;
	private int totalTicket;
	private String seatType;
	public MovieTicketDTO(String name, String theaterName, double donation, String date, String time, int totalTicket,
			String seatType) {
		super();
		this.name = name;
		this.theaterName = theaterName;
		this.donation = donation;
		this.date = date;
		this.time = time;
		this.totalTicket = totalTicket;
		this.seatType = seatType;
	}
	@Override
	public String toString() {
		return "MovieTicketDTO [name=" + name + ", theaterName=" + theaterName + ", donation=" + donation + ", date="
				+ date + ", time=" + time + ", totalTicket=" + totalTicket + ", seatType=" + seatType + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public double getDonation() {
		return donation;
	}
	public void setDonation(double donation) {
		this.donation = donation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTotalTicket() {
		return totalTicket;
	}
	public void setTotalTicket(int totalTicket) {
		this.totalTicket = totalTicket;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
}
