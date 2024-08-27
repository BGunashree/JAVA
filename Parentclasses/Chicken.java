package com.xworkz.Parentclasses;

public class Chicken {
	public String name;
	public int quantity;
	public double cost;
	public String qualtiy;
	public String shopName;
	public String type;
	public String color;
	public int noOfLegs;
	public int noOfEggsHatched;
	public char gender;
	
	public Chicken()
	{
		System.out.println("creating chicken");
	}
	
    public void cut()
    {
    	System.out.println("running cut");
    }
    public void wash()
    {
    	System.out.println("running wash");
    }
    public void cook()
    {
    	System.out.println("running cook");
    }
    public void fry()
    {
    	System.out.println("running fry");
    }
    public void eat()
    {
    	System.out.println("running eat");
    }
   
}
