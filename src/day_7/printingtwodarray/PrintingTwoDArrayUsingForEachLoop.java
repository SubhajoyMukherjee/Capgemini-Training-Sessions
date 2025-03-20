package day_7.printingtwodarray;

import java.util.Scanner;

public class PrintingTwoDArrayUsingForEachLoop {
	static Scanner scan=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the no. of Rows in the 2D Array : ");
		int row=scan.nextInt();
		System.out.println("Enter the no. of Columns in the 2D Array : ");
		int col=scan.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the values to be entered in 2D array  : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The elements entered in the array is : ");
		for(int[] i: arr)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}
