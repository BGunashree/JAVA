package com.xworkz.chaining;

public class WristWatch extends Watch {
	
	public WristWatch()
	{
		super("black",10000,"digital");
	}
	public WristWatch(String type)
	{
		this();
	}
	public void display()
	{
		System.out.println("cost:"+cost);
		System.out.println("strapColor:"+strapColor);
		System.out.println("type:"+type);
	}

}
