package com.xworkz.blocks;

public class Vehicle {

	static String type;
    String name;
    static {
    	type="Land Vehicle";
    	System.out.println("running static block");
    }
    public Vehicle(String name)
    {
    	this.name=name;
    }
    {
    	System.out.println("executing block every time a copy is created");
    }
    public void drive()
    {
    	System.out.println("running drive in vehicle");
    }
    public void display()
    {
    	System.out.println("type :"+type);
    	System.out.println("name :"+name);
    }
	
}
