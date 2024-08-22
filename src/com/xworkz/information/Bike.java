package com.xworkz.information;

public class Bike {
	private String[] bikeNames=new String[7];
	private int index;
	public void save(String bikeName)
	{
		this.bikeNames[index]=bikeName;
		index++;
	}
	public void display()
	{
		for(String name:bikeNames)
		{
			System.out.println("name: "+name);
		}
	}

}
