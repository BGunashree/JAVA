class Task1Runner
{
	public static void main(String[] args)
	{
		double ref1=Task2.medicine("Penegra");
		System.out.println("cost is: "+ref1);
		double ref2=Task2.medicine("Dolo");
		System.out.println("cost is: "+ref2);
		double ref3=Task2.medicine("Aspirin");
		System.out.println("cost is: "+ref3);
		double ref4=Task2.medicine("Cintodac");
		System.out.println("cost is: "+ref4);
		
		String ref5=Task2.prescribe("Hiccup");
		System.out.println("Medicine is: "+ref5);
		String ref6=Task2.prescribe("Headache");
		System.out.println("Medicine is: "+ref6);
		String ref7=Task2.prescribe("Fever");
		System.out.println("Medicine is: "+ref7);
		String ref8=Task2.prescribe("TB");
		System.out.println("Medicine is: "+ref8);
		
		String ref9=Task2.doctor("G M Prasad");
		System.out.println("availability : "+ref9);
		String ref10=Task2.doctor("Lavanya");
		System.out.println("availability : "+ref10);
		String ref11=Task2.doctor("Sindhu");
		System.out.println("availability : "+ref11);
		String ref12=Task2.doctor("Kishore");
		System.out.println("availability : "+ref12);
		
		System.out.println("country: "+Task1.country(91));
		System.out.println("country: "+Task1.country(93));
		System.out.println("country: "+Task1.country(55));
		System.out.println("country: "+Task1.country(61));
		System.out.println("country: "+Task1.country(975));
		System.out.println(Task1.country(1));
		System.out.println("producer: "+Task1.cinema("KGF1"));
		System.out.println("producer: "+Task1.cinema("Kantara"));
		System.out.println("producer: "+Task1.cinema("Color photo"));
		System.out.println("producer: "+Task1.cinema("Sanam Teri Kasam"));
		System.out.println("producer: "+Task1.cinema("Andala Rakshasi"));
		System.out.println(Task1.cinema("Khaidi"));
		System.out.println("cost: "+Task1.product("biriyani"));
		System.out.println("cost: "+Task1.product("neutrogena"));
		System.out.println("cost: "+Task1.product("nidwash"));
		System.out.println("cost: "+Task1.product("Rosehip oil"));
		System.out.println("cost: "+Task1.product("ferrero rocher"));
		System.out.println(Task1.product("watch"));
		
		
		
	}
}