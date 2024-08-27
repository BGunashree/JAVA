package com.xworkz.Parentclasses.Runner;

import com.xworkz.Parentclasses.Halwa;
import com.xworkz.Parentclasses.child.CarrotHalwa;

public class HalwaRunner {

	public static void main(String[] args) {
	Halwa halwa=new Halwa();
	halwa.name="Carrot";
	halwa.quantity=500;
	halwa.prepare();
	halwa.eat();
	System.out.println(halwa.name);
	System.out.println(halwa.quantity);
	CarrotHalwa carrothalwa=new CarrotHalwa();
	carrothalwa.name="pumpkin";
	carrothalwa.quantity=250;
	System.out.println(carrothalwa.name);
	System.out.println(carrothalwa.quantity);
	carrothalwa.prepare();
    carrothalwa.eat();
	}

}
