package day_12.oops.variable_shadowing;

public class Sub extends Super{
	String a="SubClass Variable";
	static String b="Subclass static Variable";
	void print()
	{
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);// By Variable shadowing the parent class b variable is shadowed by the child class b variable  
		System.out.println(Super.b); //To access the parent class b variable we use the parent class reference while accessing the b variable
	}

}
