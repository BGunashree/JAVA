class KeyRunner
{
	public static void main(String[] args)
	{
		Key key=new Key(20,"preveil");
		Keybunch keybunch=new Keybunch("steel",key);
		keybunch.display();
		
		Key key1=new Key(30,"Kwikset");
		Keybunch keybunch1=new Keybunch("plastic",key1);
		keybunch1.display();
		
		Clip clip=new Clip("black","Butterfly");
		Ganavi ganavi=new Ganavi("qwerty123@gmail.com",clip);
		ganavi.display();
		
		Clip clip1=new Clip("white","claw");
		Ganavi ganavi1=new Ganavi("asdfgh@gmail.com",clip1);
		ganavi1.display();
		
		Knife knife=new Knife(50,15);
		Ananya ananya=new Ananya(8951133425L,knife);
		ananya.display();
		
		Knife knife1=new Knife(40,17.2);
		Ananya ananya1=new Ananya(8660084213L,knife1);
			ananya1.display();
		
	}
}