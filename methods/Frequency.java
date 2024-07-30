class Frequency
{
	public static void main(String[] args)
	{
		
		int max=0;
		int s=0;
		int[] arr={1,1,3,4,1,9,1,6,6};
		for(int i=0;i<arr.length;i++)
		{
				int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
			
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>max)
			{
			    s=arr[i];
				max=count+1;
			}
		}
		System.out.println("no is: "+s);
		System.out.println("Freq: "+max);

		
	}
}
				
					