package com.xworkz.datatype.runner;

import com.xworkz.datatype.Bag;
import com.xworkz.datatype.Lasya;
import com.xworkz.datatype.Lavanya;
import com.xworkz.datatype.Rachana;
import com.xworkz.datatype.Soujanya;

public class BagRunner {

	public static void main(String[] args) {
		
		
		Lasya lasya=new Lasya();
		lasya.zip();
		System.out.println("-----------------------------");
		
		Bag bag=new Bag("Super dry",3000,"black");
		Rachana rachana=new Rachana();
		rachana.unzip(bag);
		System.out.println("-----------------------------");
		
		Lavanya lavanya=new Lavanya(bag);
		lavanya.store();
		System.out.println("-----------------------------");
		
		Bag bag1=new Bag("Daily objects",2000,"black");
		Soujanya soujanya=new Soujanya();
		soujanya.tear(bag1);
		
		
		

	}

}
