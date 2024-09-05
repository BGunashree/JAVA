package com.xworkz.inheritencetype;

public class ElectricCar extends Car{
	

    
    public ElectricCar(String brand, int speed, int batteryLife) {
        super(brand); 
       
    }
    
    public void chargeBattery() {
        System.out.println("running changebattery");
    }

}
