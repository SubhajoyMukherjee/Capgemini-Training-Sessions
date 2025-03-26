package day_12.oops.inheritance;

public class PersonStudentDriver {
	public static void main(String[] args)
	{
		Student s1= new Student("Abhijit Pramanik", 22, 121);
		Student s2=new Student("Sayan Kundu", 23, 122);
		s1.displayStudentDetails();
		//System.out.println();
		s2.displayStudentDetails();
		
	}
}
