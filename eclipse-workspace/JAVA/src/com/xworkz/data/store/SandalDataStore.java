package com.xworkz.data.store;

import com.xworkz.data.SandalData;

public class SandalDataStore {
	SandalData[] datas=new SandalData[5];
	int index;
	public void store(SandalData data)
	{
		this.datas[index]=data;
		index++;
	}
	public void print()
	{
		for(SandalData data:datas)
		{
			if(data!=null)
				data.display();
			else
				System.out.println("data points to null");
		}
	}

}
