package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.TrafficRules;

public class CityTrafficRules implements TrafficRules{
	
	public String licenceNo()
	{
		System.out.println("running licenceNo in CityTrafficRules");
		return "DL1420110012345";
	}

}
