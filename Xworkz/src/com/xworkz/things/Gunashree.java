package com.xworkz.datatyes.things;

public class Gunashree {

	public WaterBottle waterbottle;
	public void drink()
	{
		if(waterbottle!=null)
		{
			waterbottle.color="Orange";
			System.out.println(waterbottle.color);
			waterbottle.quantity=250;
			System.out.println(waterbottle.quantity);
		}
		else
		{
			System.out.println("null");
		}
	}
}
