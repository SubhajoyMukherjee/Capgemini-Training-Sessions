package day_13.method_overriding;

public class PartTimeEmployee extends Employee{
	private int workingHours;
	PartTimeEmployee(String name,double salary, int workingHours)
	{
		super(name,salary);
		this.workingHours=workingHours;
	}
	public void employeeInfo()
	{
		super.employeeInfo();
		System.out.println("Working Hours : "+workingHours);
	}
	public void designation()
	{
		
	}
	public void jobRole()
	{
		System.out.println("The Job Role of Part Time Employee is : Cloud Engineer ");
	}

}
