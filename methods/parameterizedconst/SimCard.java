class SimCard
{
	String company;
	double cost;
	int serialNo;
	public SimCard(String companyLocal,double costLocal,int serialNoLocal)
	{
	    company=companyLocal;
	    cost=costLocal;
		serialNo=serialNoLocal;
	    System.out.println("type: "+companyLocal);
		System.out.println("cost: "+costLocal);
		System.out.println("size: "+serialNoLocal);
	}
}