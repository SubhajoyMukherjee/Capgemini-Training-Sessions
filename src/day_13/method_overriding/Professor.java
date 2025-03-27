package day_13.method_overriding;

public class Professor extends Person{
	private String specialization;
	Professor(String name, int age, String specialization)
	{
		super(name,age);
		this.specialization=specialization;
	}
	public void displayProfessorInfo()
	{
		super.displayInfo();
		System.out.println("Specialization : "+specialization);
	}

}
