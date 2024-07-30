class Led
{
    String type;
	String property;
	double cost;
	public Led(String typeLocal,String propertyLocal,double costLocal)
	{
		type=typeLocal;
		property=propertyLocal;
		cost=costLocal;
		System.out.println("type: "+typeLocal);
		System.out.println("property: "+propertyLocal);
		System.out.println("cost: "+costLocal);
		
	}
}