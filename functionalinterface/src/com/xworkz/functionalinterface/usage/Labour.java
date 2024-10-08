package com.xworkz.functionalinterface.usage;

import com.xworkz.functionalinterface.interfaces.FoodApp;
import com.xworkz.functionalinterface.interfaces.Starter;

public class Labour {
	
	
	public void startUp(Starter starter)
	{
		if(starter!=null)
		{
			System.out.println("running startUp");
			starter.on();
			starter.off();
		}
		else
		{
			System.out.println("null");
		}
	}
	public void order(FoodApp foodApp)
	{
		
		if(foodApp!=null)
		{
			System.out.println("running startUp");
			foodApp.order("idliii");
			
		}
		else
		{
			System.out.println("null");
		}
		
	}

}
