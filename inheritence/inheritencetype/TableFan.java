package com.xworkz.inheritencetype;

public class TableFan extends Fan {
	
	public TableFan(String brand,double cost,String color)
	{
		super(brand,cost,color);
		
		
	}
	
	public void turnOff()
	{
		
		System.out.println("running turn off in Tablefan");
	}
	
	@Override
	public void turnOn()
	{
		super.turnOn();
		System.out.println("running turn on in Tablefan");
	}

}
