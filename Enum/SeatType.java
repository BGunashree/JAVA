package com.xworkz.enumerate.constant;

public enum SeatType {
	
	RECLINER(7),PREMIUM(8),EXECUTIVE(9);
	public int getSeatNo() {
		return seatNo;
	}
	private int seatNo;
	private SeatType(int seatNo)
	{
		this.seatNo=seatNo;
	}

}
