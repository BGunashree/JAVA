class Country
{
	String name;
	String continent;
	State state=new State("Karnataka","Kannada");
	Country(String name,String continent)
	{
		this.name=name;
		this.continent=continent;
	}
	public void display()
	{
		System.out.println("Country name: "+this.name);
		System.out.println("continent: "+this.continent);
		state.display();
		
	}
}