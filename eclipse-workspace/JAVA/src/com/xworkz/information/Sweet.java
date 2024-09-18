package com.xworkz.information;

public class Sweet {
	private String[] sweetNames=new String[7];
	private int index;
	public void save(String sweetName)
	{
		this.sweetNames[index]=sweetName;
		index++;
	}
	public void display()
	{
		for(String name:sweetNames)
		{
			System.out.println("name: "+name);
		}
	}

}
