package com.xworkz.obmethod;

public class Jean {
	
	private int size;
	private double price;
	private String type;
	private String gender;
	private String brand;
	private String color;
	public Jean(int size, String type, String gender) {
		super();
		this.size = size;
		this.type = type;
		this.gender = gender;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Jean [size=" + size + ", price=" + price + ", type=" + type + ", gender=" + gender + ", brand=" + brand
				+ ", color=" + color + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			if(obj instanceof Jean)
			{
				Jean casted=(Jean)obj;
				if(this.gender.equals(casted.gender) && this.type.equals(casted.type) && this.size==casted.size )
				{
					return true;
				}
				
			}
			else
			{
				System.out.println("obj is not insrance of jean");
			}
		}
		else
		{
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}
	

	
}
