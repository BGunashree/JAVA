class ChaatRunner
{
	double ppp=30;
	double samosap=25;
	double kachorip=15;
	public double order(String chat,String addItem)
	{
		double ta=0;
		if(chat=="samosa" && addItem=="panipuri")
		{
			ta=ppp+samosap;
			return ta;
		}
		else if(chat=="kachori" && addItem=="panipuri")
		{
			ta=kachorip+ppp;
			return ta;
		}
		else
			return ta;
	}
		
	public static void main(String[] args)
	{
		ChaatRunner cr=new ChaatRunner();
		double ta=cr.order("","");
		System.out.println(ta);
	}
}