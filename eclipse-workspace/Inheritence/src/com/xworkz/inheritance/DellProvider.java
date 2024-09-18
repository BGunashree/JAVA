package com.xworkz.inheritance;

public class DellProvider extends Provider {
	
	public DellProvider(String name,String ceoName) {
		
		super(name,ceoName);
	}
	
	public void service()
	{
		System.out.println("running service in DellProvider");
	}

}
