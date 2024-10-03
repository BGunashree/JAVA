package com.xworkz.enumerate.constant.dto;

import com.xworkz.enumerate.constant.SeatType;
import com.xworkz.enumerate.constant.TicketType;

public class TicketBookDTO {
	
	private String movieName;
	private String theatreName;
	private TicketType ticketType;
	private SeatType seatType;
	public TicketBookDTO(String movieName, String theatreName, TicketType ticketType, SeatType seatType) {
		super();
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.ticketType = ticketType;
		this.seatType = seatType;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public TicketType getTicketType() {
		return ticketType;
	}
	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	

}
