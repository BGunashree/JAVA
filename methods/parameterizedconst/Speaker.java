class Speaker
{
	String brand;
	double cost;
	char size;
	int output=40;
	Speaker(String brand)
	{
		this.brand=brand;
		
	}
	public void setcost(double cost)
	{
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Brand: "+this.brand);
		System.out.println("Cost: "+this.cost);
		System.out.println("Size: "+this.size);
		System.out.println("Output: "+this.output);
		
	}
	
	
	
	
	
	
	
	
}
