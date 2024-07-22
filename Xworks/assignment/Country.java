class Country
{
	public static void statesInIndia(String[] indiaStates)
	{
		System.out.println("start of  method politicalparties");
        for(int state=indiaStates.length-1;state>=0;state--)
			System.out.println(indiaStates[state]);
		System.out.println("end of  method politicalparties");
	}
	public static void  pincode(int[] codes)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("start of  method pincode");
		for(int pin=codes.length-1;pin>=0;pin--)
			System.out.println(codes[pin]);
		System.out.println("end of  method pincode");
	}
	public static void primeMinistersOfIndia(String[] primeMinisters)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("start of  method primeMinistersOfIndia");
		for(int no=primeMinisters.length-1;no>=0;no--)
			System.out.println(primeMinisters[no]);
		System.out.println("end of  method primeMinistersOfIndia");
	}
	public static void cabinetMinisters(String[] Ministers)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("start of  method cabinetMinisters");																										
		for(int minister=Ministers.length-1;minister>=0;minister--)
			System.out.println(Ministers[minister]);
		System.out.println("end of  method cabinetMinisters");
	}
		
	public static void politicalparties(String[] parties)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("start of  method politicalparties");
		for(int party=parties.length-1;party>=0;party--)
			System.out.println(parties[party]);
		System.out.println("end of  method politicalparties");
	}
}