package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.HotelRule;

public class CanaraHotelRule implements HotelRule{
	
	public boolean cleanPremises()
	{
		System.out.println("running cleanPremises in CanaraHotelRule");
		return true;
	}

}
