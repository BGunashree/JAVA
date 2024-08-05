class MaskRunner
{
	public static void main(String[] args)
	{
		Mask mask=new Mask();
		System.out.println("cost:"+mask.cost);
		System.out.println("size:"+mask.size);
		System.out.println("material:"+mask.material);
		
		Mask mask1=new Mask(50);
		System.out.println("cost:"+mask1.cost);
		System.out.println("size:"+mask1.size);
		System.out.println("material:"+mask1.material);
		Mask mask2=new Mask('M');
		System.out.println("cost:"+mask2.cost);
		System.out.println("size:"+mask2.size);
		System.out.println("material:"+mask2.material);
		Mask mask3=new Mask("cotton");
		System.out.println("cost:"+mask3.cost);
		System.out.println("size:"+mask3.size);
		System.out.println("material:"+mask3.material);
		Mask mask4=new Mask(100,'L',"Nylon");
		System.out.println("cost:"+mask4.cost);
		System.out.println("size:"+mask4.size);
		System.out.println("material:"+mask4.material);
		Mask mask5=new Mask(90,'S');
		System.out.println("cost:"+mask5.cost);
		System.out.println("cost:"+mask5.size);
		System.out.println("material:"+mask5.material);
		
		Kerosene kerosene=new Kerosene();
		System.out.println("price:"+kerosene.price);
		System.out.println("quantity:"+kerosene.quantity);
		System.out.println("quality:"+kerosene.quality);
		Kerosene kerosene1=new Kerosene(100,100,false);
		System.out.println("price:"+kerosene1.price);
		System.out.println("quantity:"+kerosene1.quantity);
		System.out.println("quality:"+kerosene1.quality);
		
		Kerosene kerosene2=new Kerosene(true);
		System.out.println("price:"+kerosene2.price);
		System.out.println("quantity:"+kerosene2.quantity);
		System.out.println("quality:"+kerosene2.quality);
		Kerosene kerosene3=new Kerosene(50);
		System.out.println("price:"+kerosene3.price);
		System.out.println("quantity:"+kerosene3.quantity);
		System.out.println("quality:"+kerosene3.quality);
		
		Aeroplane aeroplane=new Aeroplane();
		System.out.println("company:"+aeroplane.company);
		System.out.println("no of seats:"+aeroplane.noOfSeats);
		System.out.println("ticket price:"+aeroplane.ticketPrice);
		System.out.println("source:"+aeroplane.source);
		System.out.println("destination:"+aeroplane.destination);
		Aeroplane aeroplane1=new Aeroplane("Delta",120,20000,"Bangalore","Delhi");
		System.out.println("company:"+aeroplane1.company);
		System.out.println("no of seats:"+aeroplane1.noOfSeats);
		System.out.println("ticket price:"+aeroplane1.ticketPrice);
		System.out.println("source:"+aeroplane1.source);
		System.out.println("destination:"+aeroplane1.destination);
		Aeroplane aeroplane2=new Aeroplane("IndiGo","Bangalore","Goa");
		System.out.println("company:"+aeroplane2.company);
		System.out.println("no of seats:"+aeroplane2.noOfSeats);
		System.out.println("ticket price:"+aeroplane2.ticketPrice);
		System.out.println("source:"+aeroplane2.source);
		System.out.println("destination:"+aeroplane2.destination);
		Aeroplane aeroplane3=new Aeroplane("Vistara",200,"Bangalore","Mumbai");
		System.out.println("company:"+aeroplane3.company);
		System.out.println("no of seats:"+aeroplane3.noOfSeats);
		System.out.println("ticket price:"+aeroplane3.ticketPrice);
		System.out.println("source:"+aeroplane3.source);
		System.out.println("destination:"+aeroplane3.destination);

	}
}