package day_13.method_overriding;

public class Student extends Person {
	private int studentId;
	Student(String name, int age, int studentId)
	{
		super(name,age);
		this.studentId=studentId;
	}
	public void displayStudentInfo()
	{
		super.displayInfo();
		System.out.println("Student ID : "+studentId);
	}
	
}
