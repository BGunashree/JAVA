package com.xworkz.data;

public class SandalData {
	private String brand;
	private char size;
	private double cost;
	private String color;
	public SandalData(String brand,char size,double cost,String color)
	{
		this.brand=brand;
		this.size=size;
		this.color=color;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("brand : "+brand);
		System.out.println("size : "+size);
		System.out.println("cost : "+cost);
		System.out.println("color : "+color);
		
	}
	

}
