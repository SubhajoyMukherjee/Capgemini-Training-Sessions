package day_17.exception_handling;

public class Demo {
	public static void main(String[] args)
	{
		System.out.println("Main Starts"); 	//This will be executed
		//System.out.println(10/0); //Here it will be Arithmetic Exception occurred (/ by zero )
		String str=null;
		System.out.println("The String is given null reference already");
		str.toUpperCase();
		System.out.println(str);
		System.out.println("Main ends"); 	// This will not executed 
		
	}
	
}
