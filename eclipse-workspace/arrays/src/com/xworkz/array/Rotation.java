package com.xworkz.array;

public class Rotation {

	public static void main(String[] args) {
		
		int n=2;
		int a[]= {1,2,3,4,5,6,7,8};
		for(int i=n;i<a.length;i++)
		{
			
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row=3;
		int col=3;
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==n-i)
				{
					sum=sum+b[i][j];
				}
			}
			
		}
		System.out.println(sum);

	}

}
