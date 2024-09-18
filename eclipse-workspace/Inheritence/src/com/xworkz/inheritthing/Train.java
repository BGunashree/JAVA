package com.xworkz.inheritthing;

public class Train {
	
	private int no;
	private String source;
	private String destination;
	public Train(int no, String source, String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination = destination;
	}
	public Train(String source,String destination)
	{
		super();
		this.source = source;
		this.destination = destination;
	}
	public void display()
	{
		System.out.println("no: "+this.no);
		System.out.println("source: "+this.source);
		System.out.println("destination: "+this.destination);
		
	}

}
