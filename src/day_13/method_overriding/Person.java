package day_13.method_overriding;

public class Person {
	private String name;
	private int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("Name : "+name+"\nAge : "+age);
	}

}
