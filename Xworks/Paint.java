class Paint
{
	public static void building(String brand)
	{
		System.out.println("running below method with a String type parameter");
		System.out.println("brand: "+brand);
	}
	public static void building(String brand,String color)
	{
		System.out.println("running below method with two String type parameter");
		System.out.println("brand: "+brand);
		System.out.println("color: "+color);
	}
	public static void building(String brand,double price)
	{
		System.out.println("running below method with a String type and double type parameter");
		System.out.println("brand: "+brand);
		System.out.println("price: "+price);
	}
	public static void building(String brand,String type,double price)
	{
		System.out.println("running below method with 2 String type  and 1 double type parameter");
		System.out.println("brand: "+brand);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
	}
}