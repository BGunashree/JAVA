class ChainRunner
{
	public static void main(String[] args)
	{
		int ref1=Chain.carat();
		System.out.println("carat: "+ref1);
		int ref2=Chain.costPerGram();
		System.out.println("costPerGram: "+ref2);
		String ref3=Chain.type();
		System.out.println("type: "+ref3);
		String ref4=Chain.quality();
		System.out.println("quality: "+ref4);
		double ref5=Chain.quantity();
		System.out.println("quantity: "+ref5);
		double ref6=Chain.wastage();
		System.out.println("wastage: "+ref6);
		double ref7=Chain.serviceCharge();
		System.out.println("serviceCharge: "+ref7);
		String ref8=Chain.GST();
		System.out.println("GST: "+ref8);
	}
}