package com.xworkz.interfaces.rule;

public class BCCI {

	CricketRule cricketRule;
	public void setcricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	public void check()
	{
		if(cricketRule==null)
		{
			System.out.println("null");
			
		}
		else
		{
			cricketRule.powerPlay();
		}
	}
}
