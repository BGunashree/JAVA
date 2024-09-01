package com.xworkz.inheritthing;

public class CentralGovernment extends Government{
	
	public CentralGovernment(String state, String homeMinisterName)
	{
		super(state,homeMinisterName);
		System.out.println("created CentralGovernment");
	}

}
