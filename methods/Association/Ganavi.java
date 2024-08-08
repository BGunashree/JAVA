class Ganavi
{
	String email;
	Clip clip;
	Ganavi(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
	}
	public void display()
	{
		System.out.println("email: "+email);
		clip.display();
	}
	
}