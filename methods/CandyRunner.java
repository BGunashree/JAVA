class CandyRunner
{
	public static void main(String[] args)
	{
		Matrimony matrimony=new Matrimony();
		matrimony.companyName="Bharat";
		matrimony.founder="Murugavel Janakiraman";
		matrimony.customerCareNo=8951144517L;
		System.out.println(matrimony.companyName);
		System.out.println(matrimony.founder);
		System.out.println(matrimony.customerCareNo);
		Application application=new Application();
		application.appName="Instagram";
		application.size=400;
		application.free=true;
		System.out.println(application.appName);
		System.out.println(application.size);
		System.out.println(application.free);
		Fruit fruit=new Fruit();
		fruit.name="Jackfruit";
		fruit.price=200;
		fruit.quantity=1;
		System.out.println(fruit.name);
		System.out.println(fruit.price);
		System.out.println(fruit.quantity);
		Place place=new Place();
		place.name="Isha";
		place.distance=30;
		place.location="Chikaballapura";
		System.out.println(place.name);
		System.out.println(place.distance);
		System.out.println(place.location);
		
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		alcoholBrand.name="Tuborg";
		alcoholBrand.cost=200;
		alcoholBrand.alcoholContent=40;
		System.out.println(alcoholBrand.name);
		System.out.println(alcoholBrand.cost);
		System.out.println(alcoholBrand.alcoholContent);
		Candy candy=new Candy();
		candy.name="Hershey's";
		candy.price=200;
		candy.brand="Chocolate";
		System.out.println(candy.name);
		System.out.println(candy.price);
		System.out.println(candy.brand);
		Medicine medicine=new Medicine();
		medicine.name="Paracetemol";
		medicine.price=100;
		medicine.company="McNeil";
		System.out.println(medicine.name);
		System.out.println(medicine.price);
		System.out.println(medicine.company);
		Food food=new Food();
		food.name="Biriyani";
		food.price=200;
		food.category="Non Veg";
		System.out.println(food.name);
		System.out.println(food.price);
		System.out.println(food.category);
		
	}
}