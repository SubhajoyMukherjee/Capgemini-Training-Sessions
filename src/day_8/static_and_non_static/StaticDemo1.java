package day_8.static_and_non_static;

public class StaticDemo1 {
	static int id=10;
	String name="Raj";
	public StaticDemo1()
	{
		System.out.println(id);	//No Error as id is static variable
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		StaticDemo1 d1=new StaticDemo1();
		System.out.println(d1.name);
		System.out.println(id);
		System.out.println(StaticDemo1.id);
	}
}
