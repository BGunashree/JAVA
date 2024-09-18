package com.xworkz.inheritencetype;

public class Car extends Vehicle {
	
	public Car(String brand) {
        super(brand);  
       
    }
    
    public void accelerate() {
        System.out.println("running accelerate");
    }

}
