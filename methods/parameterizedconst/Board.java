class Board
{
	String type;
	double cost;
	String size;
	public Board(String typeLocal,double costLocal,String sizeLocal)
	{
	
		type=typeLocal;
	    cost=costLocal;
		size=sizeLocal;
	    System.out.println("type: "+typeLocal);
		System.out.println("cost: "+costLocal);
		System.out.println("size: "+sizeLocal);
	}
}