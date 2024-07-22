class PersonRunner
{
	static int count=0;
	public static void info(int noOfFingers,short weight,double height,String name)
	{
		count++;
		System.out.println("noOfFingers: "+noOfFingers);
		System.out.println("weight: "+weight);
		System.out.println("height: "+height);
		System.out.println("name: "+name);
		System.out.println(count);
		
	}
	public static void main(String[] args)
	{
		byte temp=10;
		info((int)10.21f,(short)52,157.00f,"Guna");
		info((int)10.21f,(short)52,157.00f,"Guna");
		info((int)10.21f,(short)52,157.00f,"Guna");

	}
}