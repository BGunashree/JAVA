package com.xworkz.inheritthing;

public class StateGovernment extends Government{
	
	public StateGovernment(String state,int noOfMlas,String partyHeadName, String homeMinisterName)
	{
		super( state,noOfMlas, partyHeadName,  homeMinisterName);
		System.out.println("created stategovernment copy");
	}

}
