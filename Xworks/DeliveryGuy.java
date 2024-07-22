class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("running method deliver in class DeliveryGuy");
		DeliveryVehicle.deliver(item,"FIXED");
	}
}