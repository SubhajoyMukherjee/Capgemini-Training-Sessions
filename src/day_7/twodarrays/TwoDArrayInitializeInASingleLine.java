package day_7.twodarrays;

import java.util.Arrays;

public class TwoDArrayInitializeInASingleLine {
	public static void main(String[] args)
	{
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2=new int[][] {{10,11,12},{13,14,15},{16,17,18}};
		System.out.println("The elements of 1st array are :");
		System.out.println(Arrays.deepToString(arr1));	//This prints all the array elements in a string format
		System.out.println("The elements of 2nd array are : ");
		System.out.println(Arrays.deepToString(arr2));	//This prints all the array elements in a string format
		
	}
}
