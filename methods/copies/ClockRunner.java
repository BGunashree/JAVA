class ClockRunner
{
	public static void main(String[] args)
	{
		Charger charger=new Charger();
		charger.type="USB C";
		charger.company="Anker";
		System.out.println("Type: "+charger.type);
		System.out.println("Company: "+charger.company);
		System.out.println("Price: "+charger.price);
		
		
		Crow crow=new Crow();
		crow.noOfFeather=1000;
		crow.noOfEggsHatched=5;
		System.out.println("No of Feathers: "+crow.noOfFeather);
		System.out.println("Eggs Hatched: "+crow.noOfEggsHatched);
		System.out.println("Color: "+crow.color);
		
		
		Clock clock=new Clock();
		clock.type="Analog";
		clock.cost=20000;
		System.out.println("Type: "+clock.type);
		System.out.println("Cost: "+clock.cost);
		System.out.println("Brand: "+clock.brand);
		
		
		Lolipop lolipop=new Lolipop();
		lolipop.price=20;
		lolipop.brand="Alpenlibel";
		System.out.println("Type: "+lolipop.price);
		System.out.println("Company: "+lolipop.brand);
		System.out.println("Price: "+lolipop.shape);
		
		
		Jean jean=new Jean();
		jean.type="Boot Cut";
		jean.size=28;
		System.out.println("Type: "+jean.type);
		System.out.println("Size: "+jean.size);
		System.out.println("Cost: "+jean.cost);
		
		
		Keyboard keyboard=new Keyboard();
		keyboard.company="Zebronics";
		keyboard.key="Enter";
		System.out.println("Company: "+keyboard.company);
		System.out.println("Key: "+keyboard.key);
		System.out.println("NO of keys: "+keyboard.noOfKeys);
		
		
		Mountain mountain=new Mountain();
		mountain.name="Nandhi Hills";
		mountain.location="Chikkaballapura";
		System.out.println("Nmae: "+mountain.name);
		System.out.println("Location: "+mountain.location);
		System.out.println("Height: "+mountain.height);
		
		
		Stadium stadium=new Stadium();
		stadium.name="Chinnaswamy";
		stadium.location="Bangalore";
		System.out.println("Name: "+stadium.name);
		System.out.println("Location: "+stadium.location);
		System.out.println("cost: "+stadium.cost);
		
		
		Spray spray=new Spray();
		spray.type="Water";
		spray.material="Silicon";
		System.out.println("Type: "+spray.type);
		System.out.println("Company: "+spray.material);
		System.out.println("Price: "+spray.cost);
		
		
		Claw claw=new Claw();
		claw.material="plastic";
		claw.cost=200;
		System.out.println("Type: "+claw.type);
		System.out.println("Company: "+claw.cost);
		System.out.println("Price: "+claw.material);
		
	}
}