package com.xworkz.principlee.encapsulation.external;

import com.xworkz.principlee.encapsulation.internal.Cake;

public class AmmasPastries {
	
	Cake cake;
	public AmmasPastries(Cake cake)
	{
		this.cake=cake;
	}
	public String access()
	{
		if(cake!=null)
		 return cake.getFlavour();
		else
			return null;}

}
