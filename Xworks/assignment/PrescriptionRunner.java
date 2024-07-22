class PrescriptionRunner
{
	public static void main(String[] details)
	{
		if(details.length==4)
		{
			String medicineName=details[0];
			String manufactureDate=details[1];
			String price=details[2];
			String quantity=details[3];
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Prescription.medicine(medicineName,manufactureDate,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("Pass enough references");
		}
	}
}
		