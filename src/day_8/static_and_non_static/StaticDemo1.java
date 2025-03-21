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
		System.out.println(d1.name);	//name is a non static variable so to access it we have to declare a object of StaticDemo1 Class First
		//System.out.println(d1.name);	//Error as we cannot access non static variable directly
		System.out.println(id);			//No Error. As if we are in same class inside which we have declared the static variable then to access it we cannot have to use the class reference.
		System.out.println(StaticDemo1.id);	//No Error. As inside the same class of the static variuavb
	}
}
