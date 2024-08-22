package com.xworkz.data.Runner;

import com.xworkz.data.MarketData;
import com.xworkz.data.store.MarketDataStore;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarketDataStore save=new MarketDataStore();
		MarketData data1=new MarketData("KR market","Bangalore");
		MarketData data2=new MarketData("Dubai Plaza","Bangalore");
		MarketData data3=new MarketData("National Market","Bangalore");
		MarketData data4=new MarketData("Malleshwaram","Bangalore");
		MarketData data5=new MarketData("Gandhi Bazaar","Basavanagudi");
		save.print();
		save.store(data1);
		save.store(data2);
		save.store(data3);
		save.store(data4);
		save.store(data5);
		save.print();
		
	}

}
