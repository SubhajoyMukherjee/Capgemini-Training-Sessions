package day_13.method_overriding;

public class Employee {
	private String name;
	private double salary;
	Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void employeeInfo()
	{
		System.out.println("Name : "+name+"\nSalaray : "+salary);
	}
	public void jobRole()
	{
		
	}
	
}
