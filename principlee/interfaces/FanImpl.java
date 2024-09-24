package com.xworkz.principlee.interfaces;

public class FanImpl implements Fan {

	@Override
	public void turnOn() {
		System.out.println("running turnOn in FanImpl");
		
	}
	
	@Override
	public void turnOff() {
		
		System.out.println("running turnOff in FanImpl");
	}
	
	

}
