package com.xworkz.interfaces.rule;

public class DrivingLicence {
	
	TrafficRules trafficRule;
	public DrivingLicence(TrafficRules trafficRule)
	{
		this.trafficRule=trafficRule;
	}
	public void check()
	{
		if(trafficRule!=null)
		{
			String no=trafficRule.licenceNo();
			if(no!=null)
			{
				System.out.println("licence no is:"+no);
			}
		}
		else
		{
			System.out.println("trafficRule is null");
		}
	}

}
