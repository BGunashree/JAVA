package com.xworkz.polymorphism;

public class Fan {

	private String brand;
	private double cost;
	private String color;
	
	public Fan(String brand,double cost,String color)
	{
		this(cost,color);	
		this.brand=brand;
		
	}
	public Fan(double cost,String color)
	{
		
		this.cost=cost;
		this.color=color;
		
	}
	
	public void turnOn()
	{
		System.out.println("running turnon in fan");
	}
	
	public void purchase(String brand)
	{
		this.brand=brand;
	}
	
	public void purchase(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
		
	
	public void display()
	{
		System.out.println("brand :"+brand);
		System.out.println("cost :"+cost);
		System.out.println("color :"+color);
		
	}
}
