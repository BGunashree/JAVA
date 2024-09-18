package com.xworkz.programs;

import java.util.Scanner;

public class CharacterRunner {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int temp1=n%26,temp2;

		String ans;

		int count=n/26;

		if(n<=26) {

		System.out.print((char)(n+64)); }

		else {

		if(n>26) {

		if(count<=26) {

		System.out.print((char) (count+64));

		System.out.print((char) (temp1+64));

		}

		else {

		temp2=count/26;

		count=count%26;

		System.out.print((char) (temp2+64)); System.out.print((char) (count+64));

		int temp3=n%26;

		System.out.print((char) (temp3+64)); }

		}

		}

		

	}

}
