package com.xworkz.datatype.runner;

import com.xworkz.datatype.Abhishek;
import com.xworkz.datatype.Bhumika;
import com.xworkz.datatype.Lakshmi;
import com.xworkz.datatype.Megha;
import com.xworkz.datatype.Nayana;
import com.xworkz.datatype.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Megha megha=new Megha();
		megha.wash();
		System.out.println("-----------------------");
		
		WashingMachine washingmachine=new WashingMachine("Onida","top-load",7);
		Lakshmi lakshmi=new Lakshmi();
		lakshmi.load(washingmachine);
		System.out.println("-----------------------");
		
		
		Nayana nayana=new Nayana();
		nayana.addFabricConditioner();
		System.out.println("-----------------------");
		
		Bhumika bhumika=new Bhumika();
		bhumika.powerOff();
		System.out.println("-----------------------");
		
		Abhishek abhishek=new Abhishek(washingmachine);
		abhishek.powerOn();

	}

	
}
