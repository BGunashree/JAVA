class JuiceShopRunner
{
	public static void main(String[] details)
	{
		if(details.length==5)
		{
			String name=details[0];
			String brand=details[1];
			String flavour=details[2];
			String price=details[3];
			String quantity=details[4];
			char cname=Character.parseChar(name);
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			JuiceShop.juice(name,brand,flavour,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("Pass enough references");
		}
	}
}