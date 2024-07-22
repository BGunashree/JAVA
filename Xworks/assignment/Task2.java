class Task2
{
	public static double medicine(String medicineName)
	{
		System.out.println("--------------------------------------------");
		if(medicineName=="Penegra")
		{
			System.out.println(medicineName);
			return 500;
		}
		else if(medicineName=="Dolo")
		{
			System.out.println(medicineName);
			return 50;
		}
		else if(medicineName=="Aspirin")
		{
			System.out.println(medicineName);
			return 30;
		}
		System.out.println("Invalid ");
		return 0;
	}
	public static String prescribe(String symptom)
	{
		System.out.println("--------------------------------------------");
		if(symptom=="Hiccup")
		{
			System.out.println(symptom);
			return "Penegra";
		}
		else if(symptom=="Fever")
		{
			System.out.println(symptom);
			return "Dolo";
		}
		else if(symptom=="Headache")
		{
			System.out.println(symptom);
			return "Aspirin";
		}
		System.out.println("Invalid ");
		return null;
		
	}
	public static String doctor(String docname)
	{
		System.out.println("--------------------------------------------");
		if(docname=="G M Prasad")
		{
			System.out.println(docname);
			return "yes";
		}
		else if(docname=="Sindhu")
		{
			System.out.println(docname);
			return "No";
		}
		else if(docname=="Lavanya")
		{
			System.out.println(docname);
			return "no";
		}
		System.out.println("Invalid docname");
		return null;
	}
}