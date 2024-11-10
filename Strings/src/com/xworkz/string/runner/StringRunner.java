package com.xworkz.string.runner;

public class StringRunner {

	public static void main(String[] args) {
		
		
		String name="Gunashree";
		String name1=new String("Gunashree");
		String name2="Gunashree";
		String lname="Baiyanna";
		System.out.println(name==name2);
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		String age="Twenty two";
		System.out.println(name.lastIndexOf('e'));
		System.out.println(name.charAt(4));
		System.out.println(name.concat(lname));
		System.out.println(name.endsWith("shree"));
		System.out.println(String.join("-", "Good","Noon"));
		System.out.println(name2.contentEquals(lname));
		System.out.println(name2.contains("Guna"));
		System.out.println(name2.indexOf('s'));
		System.out.println(lname.indexOf("anna"));
		System.out.println(lname.isEmpty());
		System.out.println(name1.startsWith("Guna"));
		System.out.println(name.substring(4));
		System.out.println(name.substring(4, 9));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(age.replace('T', 't'));
	}

}
