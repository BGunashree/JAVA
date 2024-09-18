package com.xworkz.information.Runner;

import com.xworkz.information.City;

public class CityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City city=new City();
		city.display();
		city.save("Bangalore");
		city.save("Hyderabad");
		city.save("Chennai");
		city.save("Vizag");
		city.save("Mysore");
		city.save("Kolar");
		city.save("Chikaballapura");
		city.display();
		
	}

}
