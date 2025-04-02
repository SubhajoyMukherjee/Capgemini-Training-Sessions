package day_17.exception_handling;

public class ExceptionPropagation {
	public static void main(String[] args)
	{
		alpha();
	}
	public static void alpha()
	{
		System.out.println("This is Alpha Method");
		beta();
	}
	public static void beta()
	{
		System.out.println("This is Beta Method");
		gamma();
	}
	public static void gamma()
	{
		System.out.println("This is Gemma Method");
		System.out.println(10/0);
	}
}
