class Fib
{
	public static void main(String[] args)
	{
		int one=1;
		int two=1;
		int latest;
		int n=12;
		int m=3,k=2;
		int[] arr=new int[13];
		for(int j=0;j<n;j++)
			{
			
		        
					arr[j]=one;
					System.out.println(arr[j]);
					latest=one+two;
					one=two;
					two=latest;
				
			}
		int i=m*m;
			System.out.println(arr[i]);
	}
}