class CompanyRunner
{
	public static void main(String[] args)
	{
		System.out.println("start of main method");
		Rupee rupee=new Rupee();
		String ref1=rupee.name;
		int ref2=rupee.value;
		int ref3=rupee.noOfRupee;
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
		
		AirCondition airCondition=new AirCondition();
		String ref4=airCondition.brand;
		double ref5=airCondition.price;
		float ref6=airCondition.length;
		System.out.println(ref4);
		System.out.println(ref5);
		System.out.println(ref6);
		
		AutoDriver autoDriver=new AutoDriver();
		String ref7=autoDriver.name;
		int ref8=autoDriver.age;
		float ref9=autoDriver.height;
		System.out.println(ref7);
		System.out.println(ref8);
		System.out.println(ref9);
		
		Autorikshaw autorikshaw=new Autorikshaw();
		String ref10=autorikshaw.company;
		long ref11=autorikshaw.liscenceNo;
		double ref12=autorikshaw.cost;
		System.out.println(ref10);
		System.out.println(ref11);
		System.out.println(ref12);
		
		Rapido rapido=new Rapido();
		String ref13=rapido.formerName;
		String ref14=rapido.CEO;
		double ref15=rapido.priceForRide;
		System.out.println(ref13);
		System.out.println(ref14);
		System.out.println(ref15);
		
		CabCompany cabCompany=new CabCompany();
		String ref16=cabCompany.name;
		String ref17=cabCompany.CEO;
		double ref18=cabCompany.priceForRide;
		System.out.println(ref16);
		System.out.println(ref17);
		System.out.println(ref18);
		
		BMTC bmtc=new BMTC();
		String ref19=bmtc.color;
		int ref20=bmtc.noOfSeats;
		int ref21=bmtc.noOfHangers;
		System.out.println(ref19);
		System.out.println(ref20);
		System.out.println(ref21);
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String ref22=foodDeliveryCompany.companyName;
		String ref23=foodDeliveryCompany.founder;
		long ref24=foodDeliveryCompany.customerCareNo;
		System.out.println(ref22);
		System.out.println(ref23);
		System.out.println(ref24);
		
		
		
	   
		

		
		System.out.println("end of main method");
	}
}
		