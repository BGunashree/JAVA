package com.xworkz.obmethod;

public class Grinder {
	
	private String brand;
	private double cost;
	private String color;
	private int noOfJars;
	private int warranty;
	private int blade;
	public Grinder(String brand, double cost, int warranty) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.warranty = warranty;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfJars() {
		return noOfJars;
	}
	public void setNoOfJars(int noOfJars) {
		this.noOfJars = noOfJars;
	}
	public int getBlade() {
		return blade;
	}
	public void setBlade(int blade) {
		this.blade = blade;
	}
	@Override
	public String toString() {
		return "Grinder [Brand=" + brand + ", cost=" + cost + ", color=" + color + ", noOfJars=" + noOfJars
				+ ", warranty=" + warranty + ", blade=" + blade + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			if(obj instanceof Grinder)
			{
				Grinder casted=(Grinder)obj;
				if(this.brand.equals(casted.brand) && this.warranty==casted.warranty && this.cost==casted.cost )
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
