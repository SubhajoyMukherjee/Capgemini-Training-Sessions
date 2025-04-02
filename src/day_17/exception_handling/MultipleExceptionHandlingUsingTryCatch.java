package day_17.exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleExceptionHandlingUsingTryCatch {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		try
		{
			System.out.println("Enter two number : ");
			int x=scan.nextInt();
			int y=scan.nextInt();
			System.out.println(x/y);
			int[] arr= {1,2,3,4,5};
			System.out.println("Enter the index to access : ");
			System.out.println(arr[scan.nextInt()]);
			Class.forName("Demo");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handles");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMisMatchException Handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handles");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		//This is to close the Scanner object to prevent resouce leak and resource release as Scanner object is very costly object(which use very much CPU resources)
		scan.close();
	}
	

}
