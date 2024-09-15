package com.xworkz.inheritance;

public class LenovoProvider extends Provider{
	
	public double profit;
	public LenovoProvider(String name,String ceoName,double profit) {
		super(name,ceoName);
		this.profit=profit;
	}
	public void service()
	{
		System.out.println("running service in LenovoProvider ");
	}
	

}
