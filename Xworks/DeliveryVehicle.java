class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("running deliver method in class DeliveryVehicle");
		Company.deliver(item,location);
	}
}