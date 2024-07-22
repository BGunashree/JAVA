class Movie
{
	public static void user(String name,int age)
	{
		char a=67;
		long b=12345678899l;
		System.out.println("a: "+a);
		
		if(age>18)
		{
			System.out.println("The buyer has to pay 1000Rs per ticket");
		}
		else
		{
			System.out.println("The buyer has to pay 500Rs");
		}
	}
	public static void main(int args)
	{
		System.out.println("abc");
		//user("Gunashree",22);
		//user("Guna",17);
	}
	public static void main(String[] args)
	{
		System.out.println("cde");
		user("Gunashree",22);
		user("Guna",17);
	}
}