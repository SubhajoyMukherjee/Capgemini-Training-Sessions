package day_17.string_buffer;
import java.lang.StringBuffer;

public class Subhajoy {
	public static void main(String[] args)
	{
	StringBuffer sb1=new StringBuffer();
	sb1.append(true); //Convert boolean data to String implicitly and add at the end
	sb1.append(false);	//Convert boolean data to String implicitly and add at the end
	sb1.append(101);	//Convert integer data to String implicitly and add at the end
	System.out.println(sb1);
	System.out.println("-------------------------------------");
	
	StringBuffer sb2=new StringBuffer("Hello World"); //Parameterized constructor of StringBuffer Class
	System.out.println(sb2);
	char[] arr= {'a','b','c','d'}; //Char Array
	StringBuffer sb3=new StringBuffer();
	//Prints the initial capacity of String Buffer Object which is 16 by default
	System.out.println("The initial capacity of StringBuffer Object is : "+sb3.capacity());	
	sb3.append(arr);        
	System.out.println(sb3);	//Convert the char Array elements to string and add at the end
	System.out.println("----------------------------------");
	
	System.out.println("The String Buffer Object Capacity is : "+sb3.capacity());	//Prints the Capacity of the object
	sb3.ensureCapacity(188); //This will make the capacity as 188
	System.out.println("---------------------------");
	System.out.println("The String Buffer Object's new Capacity is : "+sb3.capacity()); 	//Prints the new capacity
	System.out.println("--------------------------");
	StringBuffer sb4=new StringBuffer();
	sb4.append("Hello");
	sb4.insert(4,arr,1,2); 
	//insert(index,array,offset i.e. from which index in the object the addition will start,How many characters will be added from the array) 
	System.out.println(sb4);	
	}

}
