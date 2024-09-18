package com.xworkz.interfaces.rule.runner;

import com.xworkz.interfaces.rule.FoodSafetyDepartment;
import com.xworkz.interfaces.rule.HotelRule;
import com.xworkz.interfaces.rule.implement.CanaraHotelRule;

public class HotelRuleRunner {

	public static void main(String[] args) {
		
		HotelRule hotelRule=new CanaraHotelRule();
		FoodSafetyDepartment foodSafetyDepartment=new FoodSafetyDepartment();
		foodSafetyDepartment.sethotelRule(hotelRule);
		foodSafetyDepartment.inspection();
	}

}
