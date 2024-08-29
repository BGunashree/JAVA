package com.xworkz.datatype;

public class Bag {
	private String brand;
	private double cost;
	private String color;
	public Bag(String brand, double cost, String color) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}
	public void carry()
	{
		System.out.println("bag is used to carry things");
	}

	public void display()
	{
		System.out.println("brand: "+this.brand);
		System.out.println("cost: "+this.cost);
		System.out.println("color: "+this.color);
	}
}
