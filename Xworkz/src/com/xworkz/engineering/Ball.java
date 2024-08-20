package com.xworkz.engineering;

public class Ball {
	private String name;
	private String brand;
	private double price;
	private int weight;
	private double radius;
	private double diameter;
	private  String color;
	private String material;
	private String sportUsed;
	private int manufactureYear;
	private boolean inflatable;
	private String manufacturingCountry;
	private String texture;
	private String sellerName;
	private String shopSelling;
	private String buyerName;
	private int bounceRate;
	private String quality;
	private double discount;
	private String surfaceType;
	private String stitchingType;
	private boolean limitedEdition;
	private String availability;
	private String stock;
	private int noOfBalls;
	public Ball(String name,String brand,double price,int weight,double radius,double diameter,String color,String material,String sportUsed)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.weight=weight;
		this.radius=radius;
		this.diameter=diameter;
		this.color=color;
		this.material=material;
		this.sportUsed=sportUsed;
		
	}
	public void setBall(int manufactureYear,boolean inflatable,String manufacturingCountry,
			 String texture,
	 String sellerName,
	 String shopSelling,
	 String buyerName,
	 int bounceRate,
	 String quality,
	 double discount,
	 String surfaceType,
	 String stitchingType,
	 boolean limitedEdition,
	 String availability,
	 String stock,
	 int noOfBalls)
	{
		this.manufactureYear=manufactureYear;
		this.inflatable=inflatable;
		this.manufacturingCountry=manufacturingCountry;
		this.texture=texture;
		this.sellerName=sellerName;
		this.shopSelling=shopSelling;
		this.buyerName=buyerName;
		this.bounceRate=bounceRate;
		this.quality=quality;
		this.discount=discount;
		this.surfaceType=surfaceType;
		this.stitchingType=stitchingType;
		this.limitedEdition=limitedEdition;
		this.availability=availability;
		this.stock=stock;
		this.noOfBalls=noOfBalls;
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("brand: "+brand);
		System.out.println("color: "+color);
		System.out.println("weight: "+weight);
		System.out.println("radius: "+radius);
		System.out.println("diameter: "+diameter);
		System.out.println("manufacture year: "+manufactureYear);
		System.out.println("sports used: "+sportUsed);
		System.out.println("inflatable: "+inflatable);
		System.out.println("country manufactures: "+manufacturingCountry);
		System.out.println("available: "+availability);
		System.out.println("stock of ball: "+stock);
		System.out.println("limited edition: "+limitedEdition);
		System.out.println("texture: "+texture);
		System.out.println("discount: "+discount);
		System.out.println("buyer name: "+buyerName);
		System.out.println("seller name: "+sellerName);
		System.out.println("shop name: "+shopSelling);
		System.out.println("bounce rate: "+bounceRate);
		System.out.println("quality: "+quality);
		System.out.println("surface type: "+surfaceType);
		System.out.println("stitching type: "+stitchingType);
		System.out.println("no of balls: "+noOfBalls);
		System.out.println("material: "+material);
		System.out.println("price: "+price);
	}
	

}
