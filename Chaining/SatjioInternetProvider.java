package com.xworkz.inheritance;



public class SatjioInternetProvider extends JioInternetProvider {
	
	int date;
	public SatjioInternetProvider(String name,String ceoName,int date) {
		super(name,ceoName);
		this.date=date;
	}
	@Override
	public void service()
	{
		System.out.println("running service in SatjioInternetProvider ");
	}
	

}
