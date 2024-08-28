package com.xworkz.datatyes.things;

public class Devu {
	
	public void spit(WaterBottle waterbottle)
	{
		if(waterbottle!=null)
		{
			waterbottle.color="green";
			System.out.println(waterbottle.color);
			waterbottle.fill();
		}
		else
		{
			System.out.println("null");
		}
	}

}
