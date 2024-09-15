package com.xworkz.reading;

public class PersonStore {
	
	Person[] persons=new Person[5];
	int index=0;
	public void store(Person person)
	{
		if(person!=null)
		{
			persons[index++]=person;
		}
	}
	public void display()
	{
		for(Person data:persons)
		{
			if(data!=null)
			{
			  data.show();		
			}
			else
				System.out.println("data is null");
		}
	}
	

}