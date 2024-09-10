package com.xworkz.obmethod;

public class Kettle {
	
	private double cost;
	private String brand;
	private float capacity;
	private String type;
	private int discount;
	private int rating;
	public Kettle(String brand, float capacity, String type) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Kettle [cost=" + cost + ", brand=" + brand + ", capacity=" + capacity + ", type=" + type + ", discount="
				+ discount + ", rating=" + rating + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			if(obj instanceof Kettle)
			{
				Kettle casted=(Kettle)obj;
				if(this.brand.equals(casted.brand) && this.type.equals(casted.type) && this.capacity==casted.capacity )
				{
					return true;
				}
				
			}
			else
			{
				System.out.println("obj is not instance of kettle");
			}
		}
		else
		{
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
