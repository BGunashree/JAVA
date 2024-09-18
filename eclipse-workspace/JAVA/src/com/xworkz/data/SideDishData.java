package com.xworkz.data;

public class SideDishData {
	private String name;
	private double price;
	private String type;
	public SideDishData(String name,double price,String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		
	}
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("price : "+price);
		System.out.println("type : "+type);
	
		
	}

}
