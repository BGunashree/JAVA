package com.xworkz.pig;

public class ToothPaste {

	private String company;
	private boolean salt;
	public ToothPaste(String company, boolean salt) {
		super();
		this.company = company;
		this.salt = salt;
	}
	public ToothPaste(String company) {
		super();
		this.company = company;
		
	}
	public void display()
	{
		System.out.println("company:"+this.company);
		System.out.println("salt:"+this.salt);
	}
	
}
