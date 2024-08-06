class Hotel
{
	String name="Nani";
	Owner owner=new Owner("Veer",57,'M');
	public void display()
	{
		System.out.println("Hotel Name: "+this.name);
		owner.display();
	}
}