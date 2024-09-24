package com.xworkz.principlee.interfaces;

public interface Fan {
	
	void turnOn();
	default void turnOff()
	{
		System.out.println("running turnOff in Fan");
		return;
	}
	static void regulate()
	{
		System.out.println("running regulate in Fan");
	}

}
