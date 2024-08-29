package com.xworkz.datatype;

public class Lavanya {
	
	private Bag bag;
	public Lavanya(Bag bag)
	{
		this.bag=bag;
	}
	public void store()
	{
		if(bag!=null)
		{
			bag.display();
		}
		else
		{
			System.out.println("bag is null");
		}
	}

}
