package day_7.jaggedarrayinitialize;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrayInitializeUsingScanner {
	static Scanner scan = new Scanner(System.in);
	static int[][] createJaggedArray()
	{
		System.out.println("Enter no. of rows in the Jagged Array : ");
		int row=scan.nextInt();
		int[][] jarr=new int[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter no. of clomuns in the "+i+"th row of Jagged Array : ");
			jarr[i]=new int[scan.nextInt()];
			System.out.println("Enter the entries in of the "+i+"th row in the Jagged Array : ");
		}
		return jarr;
	}
	public static void main(String[] args)
	{
		int[][] jagged_arr=createJaggedArray();
		System.out.println("The Jagged Array Entered is : ");
		System.out.println(Arrays.deepToString(jagged_arr));	}
}
