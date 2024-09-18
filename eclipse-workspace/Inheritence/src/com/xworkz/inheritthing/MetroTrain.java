package com.xworkz.inheritthing;

public class MetroTrain extends Train{
	
	public MetroTrain(String source,String destination)
	{
		super(source, destination);
		System.out.println("created metrotrain copy");
	}

}
