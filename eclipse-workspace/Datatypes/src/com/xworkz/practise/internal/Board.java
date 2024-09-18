package com.xworkz.practise.internal;

public class Board {
	
	private double cost;
	private int length;
	protected Board()
	{
		System.out.println("created board");
	}
	public Board(double cost,int length)
	{
		this.cost=cost;
		this.length=length;
	}
	public void display()
	{
		System.out.println("cost :"+cost);
		System.out.println("length :"+length);
	}

}
