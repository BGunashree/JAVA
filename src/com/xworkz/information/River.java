package com.xworkz.information;

public class River {
	private String[] riverNames=new String[7];
	private int index;
	public void save(String riverName)
	{
		this.riverNames[index]=riverName;
		index++;
	}
	public void display()
	{
		for(String name:riverNames)
		{
			System.out.println("name: "+name);
		}
	}

}
