package day_13.method_overriding;

public class University {
	private Person[] people;
	University(int noOfPeople)
	{
		Person[] people=new Person[noOfPeople];
	}
	public void addPerson(Person p)
	{
		if(people[people.length-1]==null)
		{
			int i=0;
			while(people[i]!=null)
			{
				i++;
			}
			people[i]=p;
		}
		else
		{
			System.out.println("Array is OverFlowing!!!!!!");
		}
	}
	public void showPerson()
	{
		int i=0;
		System.out.println("All the Peoples Details are : ");
		while(people[i]!=null)
		{
			people[i].displayInfo();
			System.out.println("\n");
		}
		System.out.println("**********************");
	}
	
	

}
