package com.xworkz.datatyes;

import com.xworkz.datatyes.things.Divya;
import com.xworkz.datatyes.things.Harshitha;
import com.xworkz.datatyes.things.Omkar;
import com.xworkz.datatyes.things.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		Divya divya=new Divya();
		divya.wear();
		Shoe shoe=new Shoe();
		Omkar omkar=new Omkar();
		omkar.walk(shoe);
		Harshitha harshitha=new Harshitha();
		harshitha.shoe=new Shoe();
		harshitha.run();
		

	}

}
