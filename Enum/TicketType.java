package com.xworkz.enumerate.constant;

public enum TicketType {

	OFFLINE(160),ONLINE(190);
	private double cost;
	private TicketType(double cost)
	{
		this.cost=cost;
	}
	public double getCost() {
		return cost;
	}
	
}
