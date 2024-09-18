package com.xworkz.interfaces.rule.runner;

import com.xworkz.interfaces.rule.BCCI;
import com.xworkz.interfaces.rule.CricketRule;
import com.xworkz.interfaces.rule.implement.KACricketRule;

public class CricketRuleRunner {

	public static void main(String[] args) {
		
		CricketRule cricketRule=new KACricketRule();
		
		BCCI bcci=new BCCI();
		bcci.setcricketRule(cricketRule);
		bcci.check();
		
		

	}

}
