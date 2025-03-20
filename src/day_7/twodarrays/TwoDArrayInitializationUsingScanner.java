package day_7.twodarrays;

import java.util.Scanner;

public class TwoDArrayInitializationUsingScanner {
	static Scanner scan=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the no. of Rows in the 2D Array : ");
		int row=scan.nextInt();
		System.out.println("Enter the no. of Columns in the 2D Array : ");
		int col=scan.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the values to be entered in 2D array  : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)

			{
				arr[i][j]=scan.nextInt();
			}
		}
	}
}