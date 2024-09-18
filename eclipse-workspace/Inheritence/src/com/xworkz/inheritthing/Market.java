package com.xworkz.inheritthing;

public class Market {
	private int shops;
	private String name;
	private String location;
	private String type;
	
	public Market(int shops, String name, String location, String type) {
		super();
		this.shops = shops;
		this.name = name;
		this.location = location;
		this.type = type;
	}

	
	public Market( String name, String location) {
		super();
		
		this.name = name;
		this.location = location;
	}


	public void display()
	{
		System.out.println("shops: "+this.shops);
		System.out.println("name: "+this.name);
		System.out.println("location: "+this.location);
		System.out.println("type: "+this.type);
		
	}

}
