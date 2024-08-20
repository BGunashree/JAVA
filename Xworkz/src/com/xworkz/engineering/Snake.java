package com.xworkz.engineering;

public class Snake {
	
	private String name;
	private int length;
	private String type;
	public Snake(String name,int length,String type)
	{
	   this.name=name;
	   this.length=length;
	   this.type=type;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.length);
		System.out.println(this.type);
	}

}
