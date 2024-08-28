package com.xworkz.datatyes.things;

public class Akshay {
	public AirConditioner airconditioner;
	public void connect()
	{
		if(airconditioner!=null)
		{
			System.out.println(airconditioner.brand);
			System.out.println(airconditioner.cost);
		}
		else
		{
			System.out.println("null");
		}
	}

}
