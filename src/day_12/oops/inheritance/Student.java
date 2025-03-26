package day_12.oops.inheritance;

public class Student extends Person {
	private int studentId;
	Student(String name, int age, int studentId)
	{
		super(name,age);
		this.studentId=studentId;
	}
	void displayStudentDetails()
	{
		System.out.println("The Student Details are :");
		displayPersonDetails();
		System.out.println("Student ID : "+studentId+"\n");
	}
	
}
