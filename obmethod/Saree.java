package com.xworkz.obmethod;

public class Saree {
	
	private String fabric;
	private double cost;
	private String color;
	private String shopName;
	private double length;
	private String washype;
	public Saree(String fabric, double cost, String color) {
		super();
		this.fabric = fabric;
		this.cost = cost;
		this.color = color;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getWashype() {
		return washype;
	}
	public void setWashype(String washype) {
		this.washype = washype;
	}
	
	
	@Override
	public String toString() {
		return "Saree [fabric=" + fabric + ", cost=" + cost + ", color=" + color + ", shopName=" + shopName
				+ ", length=" + length + ", washype=" + washype + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			if(obj instanceof Saree)
			{
				Saree casted=(Saree)obj;
				if(this.fabric.equals(casted.fabric) && this.cost==casted.cost && this.color.equals(casted.color) )
				{
					return true;
				}
				
			}
			else
			{
				System.out.println("obj is not instance of Saree");
			}
		}
		else
		{
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

	
	

}
