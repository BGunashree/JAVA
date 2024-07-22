class TrainRunner
{
	public static void main(String[] args)
	{
		Train.book("Bangalore","Gokarna");
		Train.book("Bangalore","Murdeshwara",100);
		Train.book("Bangalore","Hubli",200,400.0);
		Train.cancel(1234);
		Train.cancel("Mysore","Bangalore");
	}
}