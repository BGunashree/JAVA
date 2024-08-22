package com.xworkz.information.Runner;

import com.xworkz.information.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		bike.display();
		bike.save("Royal Enfield");
		bike.save("Revolt");
		bike.save("Honda");
		bike.save("Jawa");
		bike.save("Svitch");
		bike.save("Hero Xtreme");
		bike.save("OLA");
		bike.display();
		

	}

}
