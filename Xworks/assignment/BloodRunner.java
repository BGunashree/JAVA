class BloodRunner{
	public static void main(String[] args)
	{
		String ref1=Blood.group();
		System.out.println("blood group: "+ref1);
		String ref2=Blood.personName();
		System.out.println("person name: "+ref2);
		double ref3=Blood.cost();
		System.out.println("cost for testing: "+ref3);
		String ref4=Blood.hospitalTested();
		System.out.println("Hospital name: "+ref4);
		boolean ref5=Blood.sickness();
		System.out.println("sickness: "+ref5);
		boolean ref6=Blood.donate();
		System.out.println("blood donate: "+ref6);
	}
}
