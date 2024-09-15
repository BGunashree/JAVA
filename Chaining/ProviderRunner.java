package com.xworkz.inheritance;

public class ProviderRunner {

	static boolean same;
	public static void main(String[] args) {
		
		DellProvider dellProvider=new DellProvider("Dell","Mivhael Dell");
		same=dellProvider.equals(new DellProvider("Dell"," Dell"));
		System.out.println(same);
		dellProvider.service();
		System.out.println("------------------------------------------------------------------");
		
        InternetProvider internetProvider=new InternetProvider("Jio", "Mukesh Ambani");
	    same=internetProvider.equals(new InternetProvider("Airtel","Gopal Vittal"));
		System.out.println(same);
		System.out.println(internetProvider);
		internetProvider.service();
		System.out.println("------------------------------------------------------------------");
		
		MovieBookingProvider movieBookingProvider=new MovieBookingProvider("BookMyShow", "Ashish");
		System.out.println(movieBookingProvider);
		same=movieBookingProvider.equals(movieBookingProvider);
		System.out.println(same);
		movieBookingProvider.service();
		System.out.println("------------------------------------------------------------------");
		
		
        SatjioInternetProvider satJioInternetProvider=new SatjioInternetProvider( "JioSatellite", "Mukesh Ambani",1998);
	    same=satJioInternetProvider.equals(satJioInternetProvider);
		System.out.println(same);
		System.out.println(satJioInternetProvider);
		satJioInternetProvider.service();
		System.out.println("------------------------------------------------------------------");
		
		
		BookMyShowMovieBookingProvider bookMyShow =new BookMyShowMovieBookingProvider("BookMyShow", "Ashish",1000);
		same=bookMyShow.equals(bookMyShow);
		System.out.println(same);
		System.out.println(bookMyShow);
		bookMyShow.service();
		System.out.println("------------------------------------------------------------------");
		
		
		LenovoProvider lenovoProvider =new LenovoProvider("lenovo", "Yang", 2.5);
		same=lenovoProvider.equals(new LenovoProvider("xyz","abc",3));
		System.out.println(same);
		System.out.println(lenovoProvider);
		lenovoProvider.service();
		System.out.println("------------------------------------------------------------------");
		
		
		AirtelInternetProvider airtelInternetProvider =new AirtelInternetProvider("airtel", "gopal");
		System.out.println(airtelInternetProvider);
	    same=airtelInternetProvider.equals(dellProvider);
		System.out.println(same);
		airtelInternetProvider.service();
		System.out.println("------------------------------------------------------------------");
		
		
		
		ExtremeAirtelInternetProvider extremAirtelInternet=new ExtremeAirtelInternetProvider("bhagya", "varun");
		System.out.println(extremAirtelInternet);
	    same=extremAirtelInternet.equals(airtelInternetProvider);
		System.out.println(same);
		extremAirtelInternet.service();
		System.out.println("------------------------------------------------------------------");
		
		
		JioInternetProvider JioInternetProvider=new JioInternetProvider("Jio", "Mukesh");
		 same=JioInternetProvider.equals(new JioInternetProvider("jio","vittal") );
		System.out.println(same);
		System.out.println(JioInternetProvider);
		JioInternetProvider.service();
		System.out.println("------------------------------------------------------------------");
		
	
		Fast5gExtreme fast5gExtreme=new Fast5gExtreme("airtel", "rajesh");
		same=fast5gExtreme.equals(new Fast5gExtreme("airtel", "vittal"));
		System.out.println(same);
		System.out.println(fast5gExtreme);
		fast5gExtreme.service();
		
	
		
		
		
	}

}
