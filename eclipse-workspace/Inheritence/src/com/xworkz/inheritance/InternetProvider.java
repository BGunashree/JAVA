package com.xworkz.inheritance;

public class InternetProvider extends Provider{
	
	public InternetProvider(String name,String ceoName) {
		super(name,ceoName);
	}
	public void service()
	{
		System.out.println("running service in InternetProvider");
	}

}
