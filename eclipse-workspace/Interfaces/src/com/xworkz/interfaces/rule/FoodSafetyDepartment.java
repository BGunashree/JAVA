package com.xworkz.interfaces.rule;

public class FoodSafetyDepartment {
	
	HotelRule hotelRule;
	public void sethotelRule(HotelRule hotelRule)
	{
		this.hotelRule=hotelRule;
	}
	public void inspection()
	{
		if(hotelRule!=null)
		{
			hotelRule.cleanPremises();
		}
		else
		{
			System.out.println("null");
		}
	}

}
