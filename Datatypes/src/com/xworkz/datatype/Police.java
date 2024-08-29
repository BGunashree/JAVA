package com.xworkz.datatype;

public class Police {
	public void load(Gun gun)
	{
		System.out.println("running load in police");
		if(gun!=null)
		{
			gun.display();
		}
		else
		{
			System.out.println("gun is null");
		}
	}

}
