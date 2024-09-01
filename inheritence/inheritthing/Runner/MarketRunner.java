package com.xworkz.inheritthing.Runner;

import com.xworkz.inheritthing.Market;
import com.xworkz.inheritthing.OnlineMarket;
import com.xworkz.inheritthing.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
	
		Market market=new Market(10,"KR Market","Bangalore","Vegetable");
		market.display();
		System.out.println("-----------------------------");
		
		SuperMarket superMarket=new SuperMarket("Royal Market","TC Palya");
		superMarket.display();
		System.out.println("-----------------------------");
		Market market1=new SuperMarket("Dream Mart","Hoskote");
		market1.display();
		System.out.println("-----------------------------");
		
		OnlineMarket OnlineMarket=new OnlineMarket("Walmart","online");
		OnlineMarket.display();
		System.out.println("-----------------------------");
		Market market2=new OnlineMarket("eBay","online");
		market2.display();

	}

}
