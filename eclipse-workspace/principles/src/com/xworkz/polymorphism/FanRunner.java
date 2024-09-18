package com.xworkz.polymorphism;



public class FanRunner {

	public static void main(String[] args) {
		
		TableFan tablefan=new TableFan("Crompton",3000,"black");
		tablefan.purchase("Bajaj");
		tablefan.display();
		tablefan.turnOff();
		tablefan.turnOn();
		


	}

}
