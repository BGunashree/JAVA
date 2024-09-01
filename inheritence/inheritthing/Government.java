package com.xworkz.inheritthing;

public class Government {
	
	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinisterName;
	public Government(String state, int noOfMlas, String partyHeadName, String homeMinisterName) {
		super();
		this.state = state;
		this.noOfMlas = noOfMlas;
		this.partyHeadName = partyHeadName;
		this.homeMinisterName = homeMinisterName;
	}
	public Government(String state, String homeMinisterName) {
		super();
		this.state = state;
		
		this.homeMinisterName = homeMinisterName;
	}
	public void display()
	{
		System.out.println("state: "+state);
		System.out.println("noOfMlas: "+noOfMlas);
		System.out.println("partyHeadName: "+partyHeadName);
		System.out.println("homeMinisterName: "+homeMinisterName);
	}
	

}
