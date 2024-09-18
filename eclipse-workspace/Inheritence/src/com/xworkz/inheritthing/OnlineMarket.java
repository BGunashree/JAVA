package com.xworkz.inheritthing;

public class OnlineMarket extends Market {

	public OnlineMarket(String name, String location) {
		super(name,location);
		System.out.println("created onlinemarket copy");
	}
}
