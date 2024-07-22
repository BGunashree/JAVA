class ForestRunner
{
	public static void main(String[] details)
	{
		if(details.length==4)
		{
			String nameOfForest=details[0];
			String area=details[1];
			String establishedYear=details[2];
			String state=details[3];
			System.out.println("Name: "+nameOfForest);
			System.out.println("Area: "+area);
			System.out.println("year of establishment: "+establishedYear);
			System.out.println("State: "+state);
		}
		else
		{
			System.out.println("pass enough references");
		}
	}
}