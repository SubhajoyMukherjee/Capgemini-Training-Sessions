package methodChaining;

public class StudentDriver {

	public static void recieve(int[] arr) {

		arr[0] = 100;

		System.out.println(arr[0]);

		arr = new int[5];

		arr[0] = 200;

		System.out.println(arr[0]);

//		
//		//System.out.println(arr[0]);
//		
//		arr[0]=200;
//		
//		System.out.println(arr[0]);
//	
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };

		System.out.println(nums[0]);
		recieve(nums);

		System.out.println(nums[0]);

	}
}
