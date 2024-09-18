package com.xworkz.interfaces.rule;

public class Guest {
	
	PGRule pgrule;
	public Guest(PGRule pgrule) {
		this.pgrule=pgrule;
	}
	public void pay()
	{
		if(pgrule!=null)
		{
			double cost=pgrule.costPerMonth();
			boolean available=pgrule.wifi();
			System.out.println("cost:"+cost);
			System.out.println("available:"+available);
			
		}
		else
		{
			System.out.println("pgrule is null");
		}
	}

}
