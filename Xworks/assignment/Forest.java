class Forest
{
	public static void main(String[] details)
	{
		if(details.length>0)
		{
			for(int info=0;info<details.length;info++)
				System.out.println(details[info]);
		}
		else
		{
			System.out.println("pass enough references");
		}
	}
}