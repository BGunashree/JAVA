class Chocolate
{
	String brand="Caramel";
	double price;
	String flavour;
	char size;
	Chocolate(String flavour)
	{
		this.flavour=flavour;
	}
	public void setprice(double price)
	{
		
		this.price=price;
	}
	public void display()
	{
		System.out.println("Brand: "+this.brand);
		System.out.println("Price: "+this.price);
		System.out.println("Flavour: "+this.flavour);
		System.out.println("Size: "+this.size);
	}
}