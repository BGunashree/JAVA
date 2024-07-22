class CollegeRunner
{
	public static void  main(String[] args)
	{
		String usn=College.student("Gunashree");
		System.out.println("usn is: "+usn);
		String usn1=College.student("Supritha");
		System.out.println("usn is: "+usn1);
		College.address("CiTech");
		College.address("SVCE");
		String ref2=College.checkNo(100);
		System.out.println(ref2);
		String ref3=College.checkNo(-7);
		System.out.println(ref3);
	}
}
		
		