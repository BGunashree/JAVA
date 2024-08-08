class Knife
{
	double weight;
	double height;
	Knife(double weight,double height)
	{
		this.weight=weight;
		this.height=height;
	}
	public void display()
	{
		System.out.println("weight: "+this.weight);
		System.out.println("height: "+this.height);
		
	}
}