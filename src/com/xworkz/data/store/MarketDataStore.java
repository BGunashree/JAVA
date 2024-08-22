package com.xworkz.data.store;

import com.xworkz.data.MarketData;


public class MarketDataStore {

	MarketData[] datas=new MarketData[5];
	int index;
	public void store(MarketData data)
	{
		this.datas[index]=data;
		index++;
	}
	public void print()
	{
		for(MarketData data:datas)
		{
			if(data!=null)
				data.display();
			else
				System.out.println("data points to null");
		}
	}
}
