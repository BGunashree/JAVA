package com.xworkz.inheritance;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider {
	
	public int totalHalls;
	public BookMyShowMovieBookingProvider(String name,String ceoName,int totalHalls) {
		super(name,ceoName);
		this.totalHalls=totalHalls;
		
	}
	
	
	@Override
	public void book()
	{
		System.out.println("running book in BookMyShowMovieBookingProvider");
	}
	@Override
	public void cancel()
	{
		System.out.println("running cancel in BookMyShowMovieBookingProvider");
	}
	@Override
	public void service()
	{
		System.out.println("running service in BookMyShowMovieBookingProvider ");
	}

}
