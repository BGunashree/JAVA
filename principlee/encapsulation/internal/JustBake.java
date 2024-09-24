package com.xworkz.principlee.encapsulation.internal;

public class JustBake {
	
	Cake cake;
	public JustBake(Cake cake)
	{
		this.cake=cake;
	}
	public String access()
	{
		if(cake!=null)
		  return cake.getFlavour(); 
		else 
			System.out.println("cake is null");
		return null;
	}
	public void modify(String cakeFlavour)
	{
		if(cake!=null)
		  cake.setFlavour(cakeFlavour);
		else
			System.out.println("cake is null");
		return;
	}

}
