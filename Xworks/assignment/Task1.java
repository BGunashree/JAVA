class Task1
{
	public static String country(int code)
	{
		System.out.println("--------------------------------------------");
		if(code==91)
		{
			System.out.println(code);
			return "India";
		}
		else if(code==93)
		{
			System.out.println(code);
			return "Afghanistan";
		}
		else if(code==975)
		{
			System.out.println(code);
			return "Bhutan";
		}
		else if(code==55)
		{
			System.out.println(code);
			return "Brazil";
		}
		else if(code==61)
		{
			System.out.println(code);
			return "Australia";
		}
		else 
		{
			System.out.println("Invalid Code country not found");
			
			return null;
		}
	}
	public static double product(String item)
	{
		System.out.println("--------------------------------------------");
		if(item=="neutrogena")
		{
			System.out.println(item);
			return 900;
		}
		else if(item=="nidwash")
		{
			System.out.println(item);
			return 130;
		}
		else if(item=="Rosehip oil")
		{
			System.out.println(item);
			return 600;
		}
		else if(item=="ferrero rocher")
		{
			System.out.println(item);
			return 900;
		}
		else if(item=="biriyani")
		{
			System.out.println(item);
			return 200;
		}
		else{
			System.out.println("Invalid name not found");
			return 0;
		}
	}
	public static String cinema(String movieName)
	{
		System.out.println("--------------------------------------------");

		if(movieName=="Color photo")
		{
			System.out.println(movieName);
			return "Sai Rajesh Neelam";
		}
		else if(movieName=="Andala Rakshasi")
		{
			System.out.println(movieName);
			return "S. S. Rajamouli";
		}
		else if(movieName=="Kantara")
		{
			System.out.println(movieName);
			return "Rishab Shetty";
		}
		else if(movieName=="KGF1")
		{
			System.out.println(movieName);
			return "Vijay Kiragandur";
		}
		else if(movieName=="Sanam teri Kasam")
		{
			System.out.println(movieName);
			return "Deepak Mukut";
		}
		else{
			System.out.println("No such movie found");
			return null;
		}
	}
}
			