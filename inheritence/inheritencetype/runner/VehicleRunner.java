package com.xworkz.inheritencetype.runner;

import com.xworkz.inheritencetype.ElectricCar;

public class VehicleRunner {

	public static void main(String[] args) {
		
        ElectricCar tesla = new ElectricCar("Tesla", 150, 10);
        
       
        tesla.start();        
        tesla.accelerate();  
        tesla.chargeBattery(); 

	}

}
