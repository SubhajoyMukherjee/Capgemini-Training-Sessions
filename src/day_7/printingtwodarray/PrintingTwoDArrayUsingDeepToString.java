package day_7.printingtwodarray;

import java.util.Arrays; // Arrays.deepToString(arr1) function is defined in this JAVA Package
import java.util.Scanner;

public class PrintingTwoDArrayUsingDeepToString {
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
		System.out.println("This is the Array Elements Entered : ");
		System.out.println(Arrays.deepToString(arr)); //This prints all the array contents in one line in form of a string
	}
}
