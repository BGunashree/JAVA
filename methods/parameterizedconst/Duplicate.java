class Duplicate
{
	public static void main(String[] args)
	{
		int[] arr={1,1,1,2,3,3,5,7};
		int val=2;
		int[] a=new int[6];
		
		int k=0;
		for(int i=1;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//System.out.println(count);
				}
				
			}
			if(count==1)
			{
				a[k]=arr[i];
				k++;
			}
		}
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=val)
			{
				a[j]=arr[i];
				j++;
			}
			
		}
		System.out.println(a.length);*/
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
				
	}
}
			
			