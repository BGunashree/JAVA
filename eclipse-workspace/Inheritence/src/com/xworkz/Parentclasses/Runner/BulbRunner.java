package com.xworkz.Parentclasses.Runner;

import com.xworkz.Parentclasses.Bulb;
import com.xworkz.Parentclasses.child.TubeLight;

public class BulbRunner {

	public static void main(String[] args) {
		Bulb bulb=new Bulb();
		bulb.volts=40;
		bulb.glow();
		System.out.println(bulb.volts);
		TubeLight tubelight=new TubeLight();
		tubelight.volts=60;
		tubelight.glow();
		System.out.println(tubelight.volts);

	}

}
