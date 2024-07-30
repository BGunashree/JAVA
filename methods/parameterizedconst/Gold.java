class Gold
{
	int carat;
	double costPerGram;
    String jewelName;
	public Gold(int caratLocal,double costPerGramLocal,String jewelNameLocal)
	{
		carat=caratLocal;
	    costPerGram=costPerGramLocal;
		jewelName=jewelNameLocal;
	    System.out.println("carat: "+carat);
		System.out.println("costPerGram: "+costPerGram);
		System.out.println("jewelName: "+jewelName);
	}
}