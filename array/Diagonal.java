package com.xworkz.array;

public class Diagonal {

	public static void main(String[] args) {


		
		int[][] a= {{1, 4, 4},
                {2, 3, 7},
                {0, 5, 1}};
		int  row=3;
		int col=3;
		int sum=0;
		int diagonalsum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				sum=(int) (sum+Math.pow(a[i][j], 2));
				if(i==j)
				{
					diagonalsum=diagonalsum+a[i][j];
				}
			}
			
		}
		int sqrt=(int) Math.sqrt(sum);
		System.out.println(sqrt);
		System.out.println(diagonalsum);
		

	}

}
