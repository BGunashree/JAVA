class CountryRunner
{
	public static void main(String[] args)
	{
		Hotel hotel=new Hotel();
		hotel.display();
		Company company=new Company(10,"SLK","Devanahalli");
		company.display();
		Country country=new Country("India","Asia");
		country.display();
	}
}