package com.xworkz.datatype;

public class Soujanya {
	public Bag tear(Bag bag)
	{
		if(bag!=null)
		{
			bag.carry();
			bag.display();
		}
		else
		{
			System.out.println("bag is null");
		}
		return bag;
	}

}
