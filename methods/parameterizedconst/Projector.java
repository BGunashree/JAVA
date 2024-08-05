class Projector
{
	String company="Benq";
		String type;
		String color;
		double weight;
	Projector(String type)
	{
		this.type=type;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public void display()
	{
		System.out.println("company: "+this.company);
		System.out.println("type: "+this.type);
		System.out.println("color: "+this.color);
		System.out.println("weight: "+this.weight);
	}
	
}