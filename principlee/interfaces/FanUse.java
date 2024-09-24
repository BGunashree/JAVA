package com.xworkz.principlee.interfaces;

public class FanUse {
	
	Fan fan;
	public FanUse(Fan fan) {
		this.fan=fan;
	}
	public void switchOn()
	{
		if(fan!=null)
		  fan.turnOn();
	}
	public void switchOff()
	{
		if(fan!=null)
		   fan.turnOff();
	}
	public void increase()
	{
		if(fan!=null)
		  Fan.regulate();
	}

}
