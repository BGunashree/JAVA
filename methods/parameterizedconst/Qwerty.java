class Qwerty
{
	public static void main(String[] args)
	{
		int n=1;
		int q=5;
		int l=q/2;
		int b=q-l;
		for(int i=1;i<=b;i++)
		{
			for(int k=i;k<b;k++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print(n);
				//System.out.print(" ");
				n++;
			}
			/*for(int m=i;m<4;m++)
			{
				System.out.print(" ");
			}*/
			/*if(i!=1 && i<=4)
			{
			   for(int l=1;l<=i-1;i++)
			   {
				System.out.print(n);
				//System.out.print(" ");
				n++;
			    }
				break;
			}*/
				
			System.out.println();
			
		}
		n=1;
		for(int i=l;i>0;i--)
		{
			for(int k=i;k<=2;k++)
			{
				
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)-1;j++)
			{
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
				
				
		
	}
}