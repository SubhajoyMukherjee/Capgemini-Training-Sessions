package day_8.oops.object;

public class Employee {
	long id;
	String name;
	long salary;
	String company;
	
	public Employee()
	{
		System.out.println("1st Constructor : Initialize all Employee Class Variable with default Value.");
		//this(id,name,salary);
	}
	public Employee(long id)
	{
		this.id=id;
		System.out.println("2nd constructor : Assisgn Employee ID to this Employee");
	}
	public Employee(long id, String name)
	{
//		this.id=id;
		this(id);
		this.name=name;
		System.out.println("3rd constructor : Assisgn Employee Name to this Employee");
	}
	public Employee(long id, String name, long salary)
	{
//		this.id=id;
//		this.name=name;
		this(id,name);
		this.salary=salary;
		System.out.println("4th constructor : Assisgn Employee Salary to this Employee");
	}
	public Employee(long id, String name, long salary, String company)
	{
//		this.id=id;
//		this.name=name;
//		this.salary=salary;
		//this();
		this(id,name,salary);
		this.company=company;
		System.out.println("5th constructor : Assisgn Employee Company to this Employee");
		System.out.println("The Employee ID : "+this.id+"\nEmployee Name : "+this.name+"\nEmployee Salary : "+this.salary+"\nEmployee Company Name : "+this.company);
	}
	
}
