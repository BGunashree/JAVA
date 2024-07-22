class Printer
{
	public static void scan()
	{
		System.out.println("scanning the documents");
		print();
	}
	public static void print()
	{
		System.out.println("printing copies");
		publish();
	}
	public static void publish()
	{
		System.out.println("publishing hard copies");
	}
	public static void send()
	{
		System.out.println("sending images");
		Printer.replica();
	}
	public static void replica()
	{
		System.out.println("replicating copies");
	}
	public static void main(String[] args)
	{
		scan();
		send();
		
		
	}
}