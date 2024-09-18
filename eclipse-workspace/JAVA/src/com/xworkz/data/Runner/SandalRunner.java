package com.xworkz.data.Runner;

import com.xworkz.data.SandalData;
import com.xworkz.data.store.SandalDataStore;

public class SandalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SandalDataStore save=new SandalDataStore();
		SandalData data1=new SandalData("bata",'M',1200,"black");
		SandalData data2=new SandalData("roadster",'S',1500,"Cream");
		SandalData data3=new SandalData("paragon",'L',1499,"White");
		SandalData data4=new SandalData("fitflop",'M',2000,"black");
		SandalData data5=new SandalData("walkmate",'M',1200,"black");
		save.print();
		save.store(data1);
		save.store(data2);
		save.store(data3);
		save.store(data4);
		save.store(data5);
		save.print();
		
		

	}

}
