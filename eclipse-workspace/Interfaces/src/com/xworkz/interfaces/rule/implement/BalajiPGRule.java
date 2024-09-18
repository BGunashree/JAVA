package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.PGRule;

public class BalajiPGRule implements PGRule{
	
	public double costPerMonth()
	{
		System.out.println("running costPerMonth in Balaji pg rule");
		return 6000;
	}

	@Override
	public boolean wifi() {
		
		System.out.println("running wifi in Balaji pg rule");
		return true;
	}
	

}