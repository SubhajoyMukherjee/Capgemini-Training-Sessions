package day_13.method_overriding;

public class FullTimeEmployee extends Employee{
	private int bonus;
	FullTimeEmployee(String name, double salary, int bonus)
	{
		super(name,salary);
		this.bonus=bonus;
	}
	public void employeeInfo()
	{
		super.employeeInfo();
		System.out.println("Bonus : "+bonus);
	}

}
