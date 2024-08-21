package com.xworkz.information;

public class Dam {
	private String[] damNames=new String[7];
	private int index;
	public void save(String damName)
	{
		this.damNames[index]=damName;
		index++;
	}
	public void display()
	{
		for(String name:damNames)
		{
			System.out.println("name: "+name);
		}
	}

}
