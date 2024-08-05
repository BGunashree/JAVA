class Sack
{
	static String size="small";
	int noOfObjects;
	
	public static void store(String name)
	{
		
		size="Large";
		System.out.println(size);
		
		//System.out.println(noOfObjects);
	}
	public static void main(String args[])
	{
		//Sack sack=new Sack();
		
		//sack.store("Box");
		//size="medium";
	
		//System.out.println(size);
		store("Box");
		
	}
}