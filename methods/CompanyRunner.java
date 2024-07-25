class CompanyRunner
{
	public static void main(String[] args)
	{
		System.out.println("start of main method");
		Rupee rupee=new Rupee();
		String name=rupee.name;
		int value=rupee.value;
		int noOfRupee=rupee.noOfRupee;
		System.out.println(name);
		System.out.println(value);
		System.out.println(noOfRupee);
		
		AirCondition airCondition=new AirCondition();
		String brand=airCondition.brand;
		double price=airCondition.price;
		float length=airCondition.length;
		System.out.println(brand);
		System.out.println(price);
		System.out.println(length);
		
		AutoDriver autoDriver=new AutoDriver();
		String autoName=autoDriver.name;
		int age=autoDriver.age;
		float height=autoDriver.height;
		System.out.println(autoName);
		System.out.println(age);
		System.out.println(height);
		
		Autorikshaw autorikshaw=new Autorikshaw();
		String company=autorikshaw.company;
		long liscenceNo=autorikshaw.liscenceNo;
		double cost=autorikshaw.cost;
		System.out.println(company);
		System.out.println(liscenceNo);
		System.out.println(cost);
		
		Rapido rapido=new Rapido();
		String formerName=rapido.formerName;
		String CEO=rapido.CEO;
		double priceForRide=rapido.priceForRide;
		System.out.println(formerName);
		System.out.println(CEO);
		System.out.println(priceForRide);
		
		CabCompany cabCompany=new CabCompany();
		String cabName=cabCompany.name;
		String CEOOfCabCompany=cabCompany.CEO;
		double ridePrice=cabCompany.priceForRide;
		System.out.println(cabName);
		System.out.println(CEOOfCabCompany);
		System.out.println(ridePrice);
		
		BMTC bmtc=new BMTC();
		String color=bmtc.color;
		int noOfSeats=bmtc.noOfSeats;
		int noOfHangers=bmtc.noOfHangers;
		System.out.println(color);
		System.out.println(noOfSeats);
		System.out.println(noOfHangers);
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String companyName=foodDeliveryCompany.companyName;
		String founder=foodDeliveryCompany.founder;
		long customerCareNo=foodDeliveryCompany.customerCareNo;
		System.out.println(companyName);
		System.out.println(founder);
		System.out.println(customerCareNo);
		
		
		
	   
		

		
		System.out.println("end of main method");
	}
}
		