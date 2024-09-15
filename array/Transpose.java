package com.xworkz.array;

public class Transpose {

	public static void main(String[] args) {
		
		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b=new int[3][3];
		int row=3;
		int col=3;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[j][i]=a[i][j];
			}
			System.out.println();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

}
