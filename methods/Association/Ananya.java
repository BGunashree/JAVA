class Ananya
{
	long mobile;
	Knife knife;
	Ananya(long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
	}
	public void display()
	{
		System.out.println("mobile: "+mobile);
		knife.display();
	}
}