package com.xworkz.datatyes;

import com.xworkz.datatyes.things.AirConditioner;
import com.xworkz.datatyes.things.Akshay;
import com.xworkz.datatyes.things.Prathiksha;
import com.xworkz.datatyes.things.Supritha;

public class AirConditionerRunner {

	public static void main(String[] args) {
		
		Supritha supritha=new Supritha();
		supritha.turnOn();
		AirConditioner airconditioner=new AirConditioner();
		Prathiksha prathiksha=new Prathiksha();
		prathiksha.turnOff(airconditioner);
		Akshay akshay=new Akshay();
		
		akshay.airconditioner=new AirConditioner();
		akshay.connect();

	}

}
