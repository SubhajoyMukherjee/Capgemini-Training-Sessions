package day_6.array;

public class BinarySearch {
	static int findMiddleOfArray(int start, int end, int[] arr, int target)
	{
		int s,e,mid;
		s=start;
		e=end;
		mid=s+e/2;
		if(target==arr[mid]) 
		{
			return mid;
		}
	}
	static int binarySearch(int[] arr, int target)
	{
		
		else if(target>arr[mid])
		{
			s=mid+1;
		}
	}
}
