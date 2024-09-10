package com.xworkz.obmethod.runner;

import com.xworkz.obmethod.Gun;
import com.xworkz.obmethod.Bedsheet;
import com.xworkz.obmethod.Bulb;
import com.xworkz.obmethod.Country;
import com.xworkz.obmethod.CreditCard;
import com.xworkz.obmethod.Grinder;
import com.xworkz.obmethod.Helmet;
import com.xworkz.obmethod.Jean;
import com.xworkz.obmethod.Kettle;
import com.xworkz.obmethod.Saree;
import com.xworkz.obmethod.State;

public class JeanRunner {

	static boolean same;
	public static void main(String[] args) {
		
		Bedsheet bedsheet=new Bedsheet("king size","maroon","cotton");
		bedsheet.setCost(1000);
		bedsheet.setDiscount(10);
		bedsheet.setShopName("gajanand");
		
		Bedsheet bedsheet1=new Bedsheet("king size","maroon","cotton");
		bedsheet1.setCost(1500);
		bedsheet1.setDiscount(10);
		bedsheet1.setShopName("prem textiles");
		
		System.out.println(bedsheet.toString());
		System.out.println(bedsheet1.toString());
		
		same=bedsheet1.equals(bedsheet);
		System.out.println("are the bedsheet instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		Saree saree=new Saree("linen",4000,"black");
		saree.setLength(5);
		saree.setWashype("dry clean");
		saree.setShopName("sudarshan");
		
		Saree saree1=new Saree("paper silk",10000,"green");
		saree1.setLength(6);
		saree1.setWashype("dry clean");
		saree1.setShopName("silk udyog");
		
		System.out.println(saree.toString());
		System.out.println(saree1.toString());
		
		same=saree.equals(saree1);
		System.out.println("are the saree instances same :"+same);
		System.out.println("------------------------------------------------");
		
		Kettle kettle=new Kettle("prestige",1.5f,"silver");
		kettle.setCost(2000);
		kettle.setDiscount(5);
		kettle.setRating(4);
		
		Kettle kettle1=new Kettle("borosil",1.8f,"glass");
		kettle1.setCost(5000);
		kettle1.setDiscount(5);
		kettle1.setRating(5);
		
		System.out.println(kettle.toString());
		System.out.println(kettle1.toString());
		
		same=kettle.equals(kettle1);
		System.out.println("are the kettle instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		Grinder grinder=new Grinder("greenchef",5000,2);
		grinder.setBlade(2);
		grinder.setColor("green");
		grinder.setNoOfJars(3);
		
		Grinder grinder1=new Grinder("greenchef",5000,2);
		grinder1.setBlade(4);
		grinder1.setColor("black");
		grinder1.setNoOfJars(2);
		
		same=grinder.equals(grinder1);
		System.out.println(grinder.toString());
		System.out.println(grinder1.toString());
		System.out.println("are the grinder instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		Helmet helmet=new Helmet("black","steelbird","full face");
		helmet.setMaterial("abs");
		helmet.setPrice(4000);
		helmet.setWeight(1600);
		
		Helmet helmet1=new Helmet("black","apache","open face");
		helmet1.setMaterial("abs");
		helmet1.setPrice(5000);
		helmet1.setWeight(1600);
		
		System.out.println(helmet.toString());
		System.out.println(helmet1.toString());
		
		same=helmet1.equals(helmet);
		System.out.println("are the state instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		State state=new State("India","Karnataka","Bengaluru");
		state.setCm("Siddaramaiah");
		state.setGovernor("tawar chand gehlot");
		state.setNoOfCities(26);
		
		State state1=new State("India","Tamil Nadu","Chennai");
		state1.setCm("mk stalin");
		state1.setGovernor("rn ravi");
		state1.setNoOfCities(30);
		
		System.out.println(state.toString());
		System.out.println(state1.toString());
		
		same=state1.equals(state);
		System.out.println("are the state instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		Country country=new Country("Asia","India","New Delhi");
		country.setPm("modi");
		country.setPresident("draupadi murmu");
		country.setStates(28);
		
		Country country1=new Country("Asia","India","New Delhi");
		country1.setPm("modi");
		country1.setPresident("draupadi murmu");
		country1.setStates(28);
		
		System.out.println(country.toString());
		System.out.println(country1.toString());
		
		same=country.equals(country1);
		System.out.println("are the country instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		
		Jean jean=new Jean(30,"straight fit","female");
		jean.setColor("black");
		jean.setPrice(1200);
		jean.setBrand("only");
		
		Jean jean1=new Jean(30,"straight fit","female");
		jean1.setColor("blue");
		jean1.setPrice(1200);
		jean1.setBrand("roadster");
		
		System.out.println(jean.toString());
		System.out.println(jean1.toString());
		
		same=jean.equals(jean1);
		System.out.println("are the jean instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		
		Bulb bulb=new Bulb("philips",200,20);
		bulb.setColor("white");
		bulb.setCost(400);
		bulb.setWarranty(1);
		
		Bulb bulb1=new Bulb("Crompton",570,12);
		bulb1.setColor("white");
		bulb1.setCost(400);
		bulb1.setWarranty(1);
		
		System.out.println(bulb.toString());
		System.out.println(bulb1.toString());
		
		same=bulb.equals(bulb1);
		System.out.println("are the bulb instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		
		Gun gun=new Gun(1000,"India","Pistol");
		gun.setMaterial("steel");
		gun.setReal(false);
		gun.setType("toy");
		
		Gun gun1=new Gun(1000,"India","Pistol");
		gun1.setMaterial("steel");
		gun1.setReal(true);
		gun1.setType("real");
		
		System.out.println(gun.toString());
		System.out.println(gun1.toString());
		
		same=gun.equals(gun1);
		System.out.println("are the gun instances same :"+same);
		System.out.println("------------------------------------------------");
		
		
		
		CreditCard card=new CreditCard(2029,"gunashree",1743);
		CreditCard card1=new CreditCard(2026,"Akshay",1256);
		System.out.println(card.toString());
		System.out.println(card1.toString());
	    same=card.equals(card1);
	    card.setBank("hdfc");
	    card.setColor("blue");
	    card.setType("visa");
	   
	    card1.setBank("kotak");
	    card1.setColor("red");
	    card1.setType("mastercard");
	    
	    
		System.out.println("card is same as card1 :"+same);
		CreditCard card2=new CreditCard(2029,"gunashree",1743);
		CreditCard card3=new CreditCard(2029,"gunashree",1743);
		same=card2.equals(card3);
		System.out.println("are the credit card instances same :"+same);
	}

}
