package com.xworkz.functionalinterface.interfaces;

@FunctionalInterface
public interface Starter {
	
	void on();
	
	default void off()
	{
		System.out.println("qwerty");
	}

}
