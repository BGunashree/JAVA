package com.xworkz.Parentclasses.Runner;

import com.xworkz.Parentclasses.Chicken;
import com.xworkz.Parentclasses.child.CountryChicken;

public class ChickenRunner {

	public static void main(String[] args) {
	Chicken chicken=new Chicken();
	chicken.cost=400;
	chicken.gender='M';
	chicken.name="Aseel";
	chicken.shopName="meat zone";
	chicken.type="Broiler";
	chicken.noOfLegs=2;
	chicken.qualtiy="good";
	chicken.color="black";
	chicken.noOfEggsHatched=0;
	chicken.quantity=2;
	chicken.cut();
	chicken.wash();
	chicken.fry();
	chicken.cook();
	chicken.eat();
	System.out.println(chicken.cost);
	System.out.println(chicken.gender);
	System.out.println(chicken.name);
	System.out.println(	chicken.shopName);
	System.out.println(chicken.type);
	System.out.println(chicken.noOfLegs);
	System.out.println(chicken.qualtiy);
	System.out.println(chicken.color);
	System.out.println(chicken.noOfEggsHatched);
	System.out.println(chicken.quantity);
	CountryChicken countrychicken=new CountryChicken();
	countrychicken.cost=500;
    countrychicken.gender='F';
	countrychicken.name="Kadaknath";
    countrychicken.shopName="fresh meat";
	countrychicken.type="Broiler";
	countrychicken.noOfLegs=2;
	countrychicken.qualtiy="good";
	countrychicken.color="white";
	countrychicken.noOfEggsHatched=20;
	countrychicken.quantity=3;
	countrychicken.wash();
	countrychicken.cut();
	countrychicken.cook();
	countrychicken.fry();
	countrychicken.eat();
	System.out.println(countrychicken.cost);
	System.out.println(countrychicken.gender);
	System.out.println(countrychicken.name);
	System.out.println(countrychicken.shopName);
	System.out.println(countrychicken.type);
	System.out.println(countrychicken.noOfEggsHatched);
	System.out.println(countrychicken.noOfLegs);
	System.out.println(countrychicken.qualtiy);
	System.out.println(countrychicken.quantity);
	System.out.println(countrychicken.color);

	
	}

}
