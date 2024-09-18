package com.xworkz.interfaces.rule;

public class SecurityCheck {

	MallRule mallRule;
	public SecurityCheck(MallRule mallRule) {

       this.mallRule=mallRule;
	}
	
	public void validate()
	{
		if(mallRule!=null)
		{
			boolean valid=mallRule.validId();
			System.out.println("valid:"+valid);
			
		}
		else
		{
			System.out.println("mallRule is null");
		}
	}
}
