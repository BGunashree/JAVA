package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.HospitalRule;

public class AsterHospitalRule implements HospitalRule {
	
	 @Override
	    public void maintainSilence() {
	        System.out.println("Silence maintained in hospital.");
	    }
	    @Override
	    public void sanitizeHands() {
	        System.out.println("Hands sanitized before entering.");
	    }
	    @Override
	    public void followVisitingHours() {
	        System.out.println("Visiting hours followed.");
	    }


}
