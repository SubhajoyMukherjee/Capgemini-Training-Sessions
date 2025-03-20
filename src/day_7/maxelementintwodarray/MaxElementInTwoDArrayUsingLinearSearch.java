package day_7.maxelementintwodarray;

import java.util.Scanner;

public class MaxElementInTwoDArrayUsingLinearSearch {
	static Scanner scan=new Scanner(System.in);
	public static int[][] arrayInitialize()
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
		return arr;
	}
	public static int maxValueInTwoDArrayUsingLinearSearch(int[][] arr)
	{
		int max_val=0;
		for(int[] i: arr)
		{
			for(int j:i)
			{
				if(j>max_val)
				{
					max_val=j;
				}
			}
		}
		return max_val;
	}
	public static void main(String[] args)
	{
		System.out.println("The Maximum Value in the array entered is : "+maxValueInTwoDArrayUsingLinearSearch(arrayInitialize()));
		
		
	}

}
