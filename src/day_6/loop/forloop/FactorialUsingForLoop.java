package day_6.loop.forloop;

import java.util.Scanner;

public class FactorialUsingForLoop {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		long num,fact=1;
		System.out.println("Enter the numter for which factorial will be calculated : ");
		num=scan.nextLong();
		if(num<0)
		{
			System.out.println("Invalid Number!\nEnter Positive Number");
		}
		else if(num==0)
		{
			System.out.println("The Factorial of "+num+" is : 1");
		}
		else
		{
			for(long i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("The factorial of "+num+" is : "+fact);
		}
		
	}

}


//This part of code is Using BigInteger Datatype which is the biggest integral datatype in JAVA
//package day_6.loop.forloop;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class FactorialUsingForLoop {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        BigInteger num, fact = BigInteger.ONE;  // Use BigInteger to store large numbers
//        
//        System.out.println("Enter the number for which factorial will be calculated: ");
//        num = scan.nextBigInteger();  // Use nextBigInteger() to read large numbers
//        
//        if (num.compareTo(BigInteger.ZERO) < 0) {  // Check if number is negative
//            System.out.println("Invalid Number! Enter Positive Number");
//        } else if (num.equals(BigInteger.ZERO)) {
//            System.out.println("The Factorial of " + num + " is: 1");
//        } else {
//            for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
//                fact = fact.multiply(i);  // Multiply using BigInteger
//            }
//            System.out.println("The Factorial of " + num + " is: " + fact);  // Print the result
//        }
//
//        scan.close();  // Close the scanner
//    }
//}