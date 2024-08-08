class Key{
	String brand;
	double weight;
	Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
	}
	public void display()
	{
		System.out.println("weight: "+weight);
		System.out.println("brand: "+brand);
	}
	
}