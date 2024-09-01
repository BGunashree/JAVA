package com.xworkz.inheritthing;

public class SubUrbanTrain extends Train{
	
	public SubUrbanTrain(int no,String source,String destination)
	{
		super(no,source,destination);
		System.out.println("creates suburbantrain copy");
	}

}
