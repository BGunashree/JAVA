package com.xworkz.chaining;

public class Watch {
	
	String type;
	String strapColor;
	double cost;
	public Watch(String type)
	{
		super();
		this.type=type;
	}
	public Watch(String strapColor,double cost,String type)
	{
		this(type);
		this.strapColor=strapColor;
		this.cost=cost;
	}
	

}
