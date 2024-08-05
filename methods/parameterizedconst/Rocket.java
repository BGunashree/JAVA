class Rocket
{
	String country="India";
	double speed;
	double fuelCapacity;
	int noOfThrusters;
	Rocket(double speed)
	{
		this.speed=speed;
	}
	public void setfuelCapacity(double fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	public void display()
	{
		System.out.println("Country: "+this.country);
		System.out.println("Speed: "+this.speed);
		System.out.println("Fuel Capacity: "+this.fuelCapacity);
		System.out.println("Output: "+this.noOfThrusters);
	}
}