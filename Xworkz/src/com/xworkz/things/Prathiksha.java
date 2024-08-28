package com.xworkz.datatyes.things;

public class Prathiksha {
	public void turnOff(AirConditioner airconditioner)
	{
		if(airconditioner!=null)
		{
			airconditioner.cool();
			airconditioner.dehumidify();
			airconditioner.filter();
		}
		else
		{
			System.out.println("null");
		}
	}

}
