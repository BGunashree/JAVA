package com.xworkz.finalkeyword;

public class SpecsRunner {

	public static void main(String[] args) {
	
		Specs spec=new Specs();
		spec.wear();
		
		CombBrush combBrush=new CombBrush();
		combBrush.brush();
		combBrush.use();
		
		WoodenComb woodenComb=new WoodenComb();
		woodenComb.brush();

	}

}
