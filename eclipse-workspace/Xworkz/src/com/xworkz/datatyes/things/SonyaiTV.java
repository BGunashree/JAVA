package com.xworkz.datatyes.things;

public class SonyaiTV extends SonyTV{
	
	double no;
	
	public SonyaiTV(String name,double cost,double no) {
		
		
		super(name,cost);
		this.no=no;
	}
	public void on()
	{
		System.out.println("on");
	}

}
