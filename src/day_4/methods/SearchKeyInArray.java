package day_4.methods;
import java.util.Scanner;

public class SearchKeyInArray {
public static void searchKeyInArray(int[] arr1,int key)
{
	int count=0;
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i]==key)
		{
			System.out.println("Key Found");
			count=1;
			break;
		}
	}
	if(count==0)
	{
		System.out.println("Key Not Found");
	}
}
public static void main(String[] args)
{
	System.out.println("Enter the Size of the Array : ");
	Scanner scanner= new Scanner(System.in);
	int n=scanner.nextInt();
	int[] arr2;
	arr2= new int[n];
	System.out.println("Enter the Array Elements : ");
	for(int i=0;i<n;i++)
	{
		arr2[i]=scanner.nextInt();
	}
	System.out.println("Enter the Key Element : ");
	int key1=scanner.nextInt();
	
	SearchKeyInArray.searchKeyInArray(arr2, key1);
}
}
