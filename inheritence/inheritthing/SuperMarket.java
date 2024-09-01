package com.xworkz.inheritthing;

public class SuperMarket extends Market {
	
	public SuperMarket( String name, String location)
	{
		super(name,location);
		System.out.println("created supermarket copy");
		
	}

}
