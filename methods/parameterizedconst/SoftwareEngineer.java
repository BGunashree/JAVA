class SoftwareEngineer
{
	String name;
	int experience;
	String designation;
	double salary;
	SoftwareEngineer(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void display()
	{
		
		System.out.println("Name: "+this.name);
		System.out.println("experience: "+this.experience);
		System.out.println("designation: "+this.designation);
		System.out.println("salary: "+this.salary);
		
	}
	
}