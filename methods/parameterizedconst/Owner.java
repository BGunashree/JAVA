class Owner{
	String name;
	int age;
	char gender;
	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
		
	}
}