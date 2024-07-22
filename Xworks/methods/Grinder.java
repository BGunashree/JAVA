class Grinder
{
	public static void grinding()
	{
		System.out.println("mixer is used for Grinding");
		blending();
		
	}
	public static void blending()
	{
		System.out.println("mixer blends food ingredients");
		grinding();
	}
	public static void main(String[] args)
	{
		grinding();
	}
}
	
		
	