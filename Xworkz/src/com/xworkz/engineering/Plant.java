package com.xworkz.engineering;

public class Plant {
	private String name;
	private String type;
	private double price;
	private int height;
	private int lifeSpan;
	private boolean isMedicinal;
	private boolean flowering;
	private int age;
	private String region;
	private String color;
	public Plant(String name,String type,double price,int height,int lifeSpan) {
		this.name=name;
		this.type=type;
		this.price=price;
		this.height=height;
		this.lifeSpan=lifeSpan;
	}
	public void getPlant(boolean isMedicinal,boolean flowering,int age,String region,String color)
	{
		this.isMedicinal=isMedicinal;
		this.flowering=flowering;
		this.age=age;
		this.region=region;
		this.color=color;
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
		System.out.println("height"+height);
		System.out.println("lifeSpan: "+lifeSpan);
		System.out.println("isMedicinal: "+isMedicinal);
		System.out.println("flowering: "+flowering);
		System.out.println("age: "+age);
		System.out.println("region: "+region);
		System.out.println("color: "+color);
	}
	
	

}
