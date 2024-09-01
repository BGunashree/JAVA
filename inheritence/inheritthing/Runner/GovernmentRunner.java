package com.xworkz.inheritthing.Runner;

import com.xworkz.inheritthing.CentralGovernment;
import com.xworkz.inheritthing.Government;
import com.xworkz.inheritthing.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {
		
		Government government=new Government("Karnataka",224,"Congress","Parameshwar");
		government.display();
		System.out.println("----------------------------------------------");
		
		
		CentralGovernment centralGovernment=new CentralGovernment("Telangana","Anumula Revanth Reddy");
		centralGovernment.display();
		System.out.println("----------------------------------------------");
		Government government1=new CentralGovernment("Madhya Pradesh","Mohan Yadav");
		government1.display();
		System.out.println("----------------------------------------------");
		
		
		StateGovernment stateGovernmenmt=new StateGovernment("Bihar",243,"BJP","Nitish Kumar");
		stateGovernmenmt.display();
		System.out.println("----------------------------------------------");
		Government government2=new StateGovernment("Kerala",220,"UDF","Pinarayi Vijayan");
		government2.display();
		
	}

}
