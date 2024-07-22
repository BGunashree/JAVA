class College
{
	public static String student(String studentName)
	{
		
		if(studentName=="Gunashree")
		{
			System.out.println(studentName);
			return "1CD20CS052";
		}
		else if(studentName=="Pratheeksha")
		{
			System.out.println(studentName);
			return "1VE20EC040";
		}
		System.out.println("Student name not found");
		return "Not available";
	}
	public static void address(String collegeName)
	{
		if(collegeName=="CiTech")
		{
			System.out.println("KR Puram");
			return;
		}
	    else{
			System.out.println("Invalid ");
		}
	}
    public static String checkNo(int number)
	{
		if(number>=0)
		{
		
			return "Positive no";
			
		}
		else 
		{
			return "negative number";
		}
		//return "not reachable";
	}
}
		
			