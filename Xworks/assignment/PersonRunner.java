class PersonRunner
{
	public static void main(String[] details)
	{
		if(details.length==4)
		{
			String name=details[0];
			String email=details[1];
			String age=details[2];
			String password=details[3];
			System.out.println("Name: "+name);
			System.out.println("Emailid: "+email);
			System.out.println("Age: "+age);
			System.out.println("Password: "+password);
		}
		else
		{
			System.out.println("pass enough references");
		}
	}
	
}