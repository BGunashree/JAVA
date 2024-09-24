package com.xworkz.principlee.encapsulation.runner;

import com.xworkz.principlee.encapsulation.external.AmmasPastries;
import com.xworkz.principlee.encapsulation.internal.Cake;
import com.xworkz.principlee.encapsulation.internal.JustBake;

public class CakeRunner {

	static String flavourName;
	public static void main(String[] args) {
		
		Cake cake=new Cake();
		JustBake justBake=new JustBake(cake);
		flavourName=justBake.access();
		System.out.println(flavourName);
		justBake.modify("Red Velvet");
		System.out.println(justBake.access());
		Cake cake1=new Cake();
		AmmasPastries ammasPastries=new AmmasPastries(cake1);
		System.out.println(ammasPastries.access());
		
	}

}
