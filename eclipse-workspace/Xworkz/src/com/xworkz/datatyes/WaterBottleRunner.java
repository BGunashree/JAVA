package com.xworkz.datatyes;

import com.xworkz.datatyes.things.Devu;
import com.xworkz.datatyes.things.Gunashree;
import com.xworkz.datatyes.things.Shwetha;
import com.xworkz.datatyes.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		Devu devu=new Devu();
		WaterBottle waterbottle=new WaterBottle();
		devu.spit(waterbottle);
		Shwetha shwetha=new Shwetha();
		shwetha.pour();
		Gunashree gunashree=new Gunashree();
		gunashree.waterbottle=new WaterBottle();
		gunashree.drink();
		
		

	}

}
