class Ganavi
{
	String email;
	Clip clip=new Clip("red","clawww");
	Ganavi(String email)
	{
		this.email=email;
		//this.clip=clip;
	}
	public void display()
	{
		System.out.println("email: "+email);
		clip.display();
	}
	
}