package com.xworkz.inheritance;

public class Fast5gExtreme extends ExtremeAirtelInternetProvider{
	
	public Fast5gExtreme(String name,String ceoName) {
		
		super(name,ceoName);
	}
	@Override
	public void service()
	{
		System.out.println("running service in Fast5gExtreme ");
	}

}
