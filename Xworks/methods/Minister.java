class Minister
{
	public static void serve()
	{
		System.out.println("minister serves during is period");
		Assistant.help();
	}
}

class Assistant
{
	public static void help()
	{
		System.out.println("Assistant helps in work");
		Driver.drive();
	}
}

class Driver
{
	public static void drive()
	{
		System.out.println("Driver drives the minister vehicle");
		Vehicle.transport();
	}
}

class Vehicle
{
	public static void transport()
	{
		System.out.println("Vehicle is used for transportation");
		MusicSystem.play();
	}
}

class MusicSystem
{
	public static void play()
	{
		System.out.println("Playing music");
		Application.run();
	}
}

class Application
{
	public static void run()
	{
		System.out.println("running music using app");
		Internet.stream();
	}
}

class Internet
{
	public static void stream()
	{
		System.out.println("straming music over internet");
		Server.connect();
	}
}

class Server
{
	public static void connect()
	{
		System.out.println("connecting server");
		Location.display();
	}
}

class Location
{
	public static void display()
	{
		System.out.println("displaying location");
		Building.openGate();
	}
}

class Building
{
	public static void openGate()
	{
		System.out.println("open the gate");
		Metal.strength();
	}
}

class Metal
{
	public static void strength()
	{
		System.out.println("metal strength");
		Factory.make();
	}
}

class Factory
{
	public static void make()
	{
		System.out.println("factory manufactures");
		Machine.design();
	}
}

class Machine
{
	public static void design()
	{
		System.out.println("designing machine");
		Engineer.nothing();
	}
}

class Engineer
{
	public static void nothing()
	{
		System.out.println("we do nothing");
	}
}

	