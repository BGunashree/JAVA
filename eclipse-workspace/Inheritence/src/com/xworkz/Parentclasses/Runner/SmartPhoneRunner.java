package com.xworkz.Parentclasses.Runner;

import com.xworkz.Parentclasses.SmartPhone;
import com.xworkz.Parentclasses.child.Redmi;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.cost=20000;
		smartphone.name="Redmi note 8";
		smartphone.memory=128;
		smartphone.os="android";
		smartphone.dial();
		smartphone.message();
		System.out.println(smartphone.cost);
		System.out.println(smartphone.name);
		System.out.println(smartphone.memory);
		System.out.println(smartphone.os);
		Redmi redmi=new Redmi();
		redmi.cost=18000;
		redmi.name="redmi note 8 pro";
		redmi.memory=128;
		redmi.os="android";
		redmi.dial();
		redmi.message();
		System.out.println(redmi.cost);
		System.out.println(redmi.name);
		System.out.println(redmi.memory);
		System.out.println(redmi.os);
		

	}

}
