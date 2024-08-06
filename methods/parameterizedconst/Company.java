class Company
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Akshay",3,"SW Engineer",40000);
	Company(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("location: "+location);
		softwareEngineer.display();
	}
}