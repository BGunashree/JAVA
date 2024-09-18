package com.xworkz.inheritencetype.runner;

import com.xworkz.inheritencetype.Belt;
import com.xworkz.inheritencetype.Dancer;
import com.xworkz.inheritencetype.LeatherBelt;

public class BeltRunner {

	public static void main(String[] args) {
		
		Belt belt=new Belt();
		Dancer dancer=new Dancer();
		dancer.use(belt);
		LeatherBelt leatherBelt=new LeatherBelt();
		dancer.use(leatherBelt);

	}

}
