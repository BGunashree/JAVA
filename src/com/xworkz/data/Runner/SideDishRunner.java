package com.xworkz.data.Runner;

import com.xworkz.data.SideDishData;
import com.xworkz.data.store.SideDishDataStore;

public class SideDishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SideDishDataStore save=new SideDishDataStore();
		SideDishData data1=new SideDishData("Naan",100,"bread");
		SideDishData data2=new SideDishData("Salad",200,"Veg");
		SideDishData data3=new SideDishData("peanut salad",180,"veg");
		SideDishData data4=new SideDishData("Kakdi Koshimbir",150,"veg");
		SideDishData data5=new SideDishData("chicken pepper",100,"non veg");
		save.print();
		save.store(data1);
		save.store(data2);
		save.store(data3);
		save.store(data4);
		save.store(data5);
		save.print();

	}

}
