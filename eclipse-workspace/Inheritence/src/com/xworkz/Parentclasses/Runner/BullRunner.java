package com.xworkz.Parentclasses.Runner;

import com.xworkz.Parentclasses.Bull;
import com.xworkz.Parentclasses.child.RodeoBull;

public class BullRunner {

	public static void main(String[] args) {
		Bull bull=new Bull();
		bull.age=5;
		bull.color="Black";
		bull.breed="Angus";
		bull.weight=720;
		bull.aggressive=true;
		System.out.println(bull.age);	
		System.out.println(bull.color);	
		System.out.println(bull.breed);	
		System.out.println(bull.weight);	
		System.out.println(bull.aggressive);	
		bull.eat();
		bull.rest();
		bull.fight();
		bull.makeSound();
		bull.run();
		RodeoBull rodeobull=new RodeoBull();
		rodeobull.age=10;
		rodeobull.color="Black";
		rodeobull.breed="Angus";
		rodeobull.weight=800;
		rodeobull.aggressive=false;
		System.out.println(rodeobull.age);	
		System.out.println(rodeobull.color);	
		System.out.println(rodeobull.breed);	
		System.out.println(rodeobull.weight);	
		System.out.println(rodeobull.aggressive);	
				
		rodeobull.eat();
		rodeobull.rest();
		rodeobull.run();
		rodeobull.fight();
		rodeobull.makeSound();
		
	}

}
