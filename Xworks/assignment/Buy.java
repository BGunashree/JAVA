class Buy
{
	public static void product(String brand,double price)
	{
		
		if(price>0)
		{
			System.out.println("valid,buy");
			System.out.println("Brand: "+brand);
			System.out.println("price: "+price);
		
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public static void product(String name,int quantity,String quality,double price)
	{
		
		if(quantity>0 && price<50000)
		{
			System.out.println("valid,buy");
			System.out.println("name: "+name);
			System.out.println("quantity: "+quantity);
			System.out.println("quality: "+quality);
			System.out.println("price: "+price);
		
		}
		else{
				System.out.println("inavlid");
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		
		if(quantity<500)
		{
			System.out.println("valid");
			System.out.println("name: "+name);
			System.out.println("theaterName: "+theaterName);
			System.out.println("quantity: "+quantity);
			System.out.println("price: "+price);
			
		}
		else{
			System.out.println("in-valid,too many");
		}
			
		
	}
	public static void buyEgg(int total, double pricePerEgg) {
    if (total > 0 && pricePerEgg>0) {
        System.out.println("total: " + total);
        System.out.println("pricePerEgg: " + pricePerEgg);
    }
	else 
	{
        System.out.println("Invalid number of eggs. Please enter a number greater than zero.");
    }
    }

	public static void buyShampoo(int quantityInMl, double price, String brand, String manfDate) {
    if (quantityInMl > 0 && price > 0) {
        System.out.println("quantityInMl: " + quantityInMl);
        System.out.println("price: " + price);
        System.out.println("brand: " + brand);
        System.out.println("manfDate: " + manfDate);
    } 
	else {
        System.out.println("Invalid input. Please enter a positive quantity and price.");
    }
    }

	public static void buyCake(char size, String type, String flavour, double cost, int quantity) {
    if ((size == 'S' || size == 'M' || size == 'L') && cost > 0 && quantity > 0) {
        System.out.println("size: " + size);
        System.out.println("type: " + type);
        System.out.println("flavour: " + flavour);
        System.out.println("cost: " + cost);
        System.out.println("quantity: " + quantity);
    } 
	else {
        System.out.println("Invalid input. Please enter a valid size (S, M, L), a positive cost, and a positive quantity.");
    }
    }

	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		if(harddiskSize>0 && ramSize>0)
		{
			
			System.out.println("brand: "+brand);
			System.out.println("serialNo: "+serialNo);
			System.out.println("price: "+price);
			System.out.println("batteryCapacity: "+batteryCapacity);
			System.out.println("screenSize: "+screenSize);
			System.out.println("os: "+os);
			System.out.println("harddiskSize: "+harddiskSize);
			System.out.println("ramSize: "+ramSize);
		}
		else{
			System.out.println("invalid");
		}
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		if(mode<=3 && price>0 && color<7 && (type=='A' || type=='D'))
		{
			System.out.println("brand: "+brand);
			System.out.println("price: "+price);
			System.out.println("color: "+color);
			System.out.println("type: "+type);
			System.out.println("mode: "+mode);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public static void main(String[] args)
	{
		product("Armani",-20.0);
		product("Armani",10000.0);
		product("Watch",1,"Premium",15000.0);
		product("Watch",0,"Premium",50000.0);
		bookMovieTicket("Kalki","Gowrishankar",600,250);
		bookMovieTicket("Kalki","Gowrishankar",300,250);
		buyEgg(12,0.0);
		buyEgg(24,7.5);

		buyShampoo(100,350.0,"Mildy","25-6-2024");
		buyShampoo(0,100.0,"KhadiNaturals","1-5-2024");
		
		buyCake('M',"Pastry","Red velvet",500.0,1);
		
		buyCake('Q',"Pastry","black forest",600,0);
		
		buyLaptop("HP",23244,-800.0,999,140.0,"Windows 11",512,16);
		buyLaptop("DELL",12345,60000.0,999,150.0,"Linux",0,16);
		buySmartWatch("Emporio",15000,2,'A',2);
		buySmartWatch("Emporio",20000,5,'C',5);
		
		
	}
}
		
		
		
		
		
		
		