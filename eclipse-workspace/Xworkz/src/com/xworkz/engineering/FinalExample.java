package com.xworkz.engineering;

public class FinalExample {

	public static void main(String[] args) {
		
		Example e=new Example(2,3);
		System.out.println(e.i);
		System.out.println(e.j);
		e.j=4;
		
		System.out.println(e.j);
		Example e1=new Example(3,5);
		System.out.println(e1.i);
		System.out.println(e1.j);
		

	}

}
