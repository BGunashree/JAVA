package com.xworkz.enumerate.constant;

public enum ProductType {
	
	KITCHEN(8000,"Mixer"),FOOTWEAR(1500,"Sandals"),FURNITURE(100000,"Sofa");
	private double cost;
	private String productName;
	private ProductType(double cost, String productName) {
		this.cost = cost;
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public String getProductName() {
		return productName;
	}
	
	

}
