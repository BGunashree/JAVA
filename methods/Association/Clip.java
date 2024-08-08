class Clip
{
	String color;
	String type;
	Clip(String color,String type)
	{
		this.color=color;
		this.type=type;
	}
	public void display()
	{
		System.out.println("color: "+color);
		System.out.println("type: "+type);
		
	}
}