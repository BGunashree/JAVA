class Maths
{
	public static void Area(double length)
	{
		System.out.println("running area method with a double type parameter");
		System.out.println("length: "+length);
	}
	public static void Area(double length,String length)
	{
		System.out.println("running area method with two double type parameter");
		System.out.println("length: "+length);
		System.out.println("breadth: "+length);
	}
	public static void Area(double length,double breadth,double height)
	{
		System.out.println("running area method with three double type parameter");
		System.out.println("length: "+length);
		System.out.println("breadth: "+breadth);
		System.out.println("height: "+height);
		
	}
	public static void triangle(String name,int angle)
	{
		System.out.println("running area method with a String and int type parameter");
		System.out.println("name: "+name);
		System.out.println("angle: "+angle);
	}
	public static void triangle(String name)
	{
		System.out.println("running triangle method with a String type parameter");
		System.out.println("name: "+name);
	}
	
	
	public static void main(String[] args)
	{
		Area(10.0,11.2,6);
		Area(3.2,"12cm");
		Area(12.9);
		triangle("Right angle",90);
		triangle("Right angle");
	}
}