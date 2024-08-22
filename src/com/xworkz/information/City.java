package com.xworkz.information;

public class City {
	private String[] cityNames=new String[7];
	private int index;
	public void save(String cityName)
	{
		this.cityNames[index]=cityName;
		index++;
	}
	public void display()
	{
		for(String name:cityNames)
		{
			System.out.println("name: "+name);
		}
	}

}
