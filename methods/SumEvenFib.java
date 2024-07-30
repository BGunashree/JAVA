class SumEvenFib
{
	public static void main(String[] args)
	{
		int one=1;
		int two=1;
		int latest;
		int n=12;
	    int sum=0;
		int[] arr=new int[13];
		for(int j=0;j<n;j++)
			{
			
		        
					arr[j]=one;
					System.out.println(arr[j]);
					latest=one+two;
					one=two;
					two=latest;
				
				
			}
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			 sum=sum+arr[i];
		}
		System.out.println(sum);
			
	}
}