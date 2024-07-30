class Guna
{
	public static void main(String[] args)
	{
		int one=1;
		int two=1;
		int latest;
		int n=5;
		
		
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<=i;j++)
			{
			
		        
					System.out.print(one+" ");
					latest=one+two;
					one=two;
					two=latest;
				
			}
			System.out.println();
		}
	}
}