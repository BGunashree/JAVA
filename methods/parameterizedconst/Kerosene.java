class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	Kerosene()
	{
	}
	Kerosene(double price,int quantity,boolean quality)
	{
		this.price=price;
		this.quality=quality;
		this.quantity=quantity;
	}
	Kerosene(boolean quality)
	{
		this.quality=quality;
	}
	Kerosene(double price)
	{
		this.price=price;
	}
}