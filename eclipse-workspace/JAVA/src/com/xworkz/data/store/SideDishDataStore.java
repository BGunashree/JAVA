package com.xworkz.data.store;

import com.xworkz.data.SideDishData;

public class SideDishDataStore {
	SideDishData[] datas=new SideDishData[5];
	int index;
	public void store(SideDishData data)
	{
		this.datas[index]=data;
		index++;
	}
	public void print()
	{
		for(SideDishData data:datas)
		{
			if(data!=null)
				data.display();
			else
				System.out.println("data points to null");
		}
	}

}
