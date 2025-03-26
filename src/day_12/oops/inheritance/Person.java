package day_12.oops.inheritance;

public class Person {
	private String name;
	private int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayPersonDetails()
	{
		//System.out.println("The Person Details are : ");
		System.out.println("Name : "+ this.name+"\nAge : "+ this.age);
	}
}
