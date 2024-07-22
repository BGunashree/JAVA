class Train
{
	public static void book(String source,String destination)
	{
		System.out.println("running book method with two String type parameter");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("running book method with two String type and 1 int type parameter");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
		System.out.println("quantity: "+quantity);
	}
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("running book method with two String,one int and one double type parameter");
		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
		System.out.println("quantity: "+quantity);
		System.out.println("price: "+price);
	}
	public static void cancel(int ticketno)
	{
		System.out.println("running cancel method with 1 int type parameter");
		System.out.println("ticketno: "+ticketno);
	}
	public static void cancel(String source,String destination)
	{
		System.out.println("running cancel method with two String type parameter");

		System.out.println("source: "+source);
		System.out.println("destination: "+destination);
	}
}
		
		
		