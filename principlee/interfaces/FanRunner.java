package com.xworkz.principlee.interfaces;

public class FanRunner {

	public static void main(String[] args) {
		
		
		Fan fan=new FanImpl();
		FanUse fanUse=new FanUse(fan);
		fanUse.switchOn();
		fanUse.switchOff();
		fanUse.increase();
		

	}

}
