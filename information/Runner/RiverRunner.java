package com.xworkz.information.Runner;

import com.xworkz.information.River;

public class RiverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		River river=new River();
		river.display();
		river.save("Ganga");
		river.save("krishna");
		river.save("indus");
		river.save("narmada");
		river.save("mahanadi");
		river.save("godavari");
		river.save("Yamuna");
		river.display();
		
	}

}
