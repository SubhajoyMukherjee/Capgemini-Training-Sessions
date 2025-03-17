package day_5.methodoverloading;

public class MethodOverLoading {
	public static void main(String[] args)
	{
		System.out.println(add(10,20));
		add(10,20,30,40);
		
	}
//	public static int add(int num1, int num2)
//	{
//		System.out.println("first");
//		System.out.println(num1+num2);
//		return(num1+num2);
//	}
	public static int add(int num1, int num2)
	{
		System.out.println("first");
		System.out.println(num1+num2);
		return(num1+num2);
	}
	public static void add(int num1, int num2, int num3, int num4)
	{
		System.out.println("Second");
		System.out.println(num1+num2+num3+num4);
	}
	public static void add(byte num1, byte num2)
	{
		System.out.println("third");
		System.out.println(num1+num2);
	}

}
