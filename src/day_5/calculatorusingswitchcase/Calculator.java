package day_5.calculatorusingswitchcase;

import java.util.Scanner;

public class Calculator {

	void addMenu()
	{
		double num1, num2, num3, num4;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice :\n1)Enter 1 to add two nos\n2)Enter 2 to add three nos\n3)Enter 3 to add four nos\n");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			System.out.print("The Summation is : ");
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println("Enter three numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			num3=scan.nextDouble();
			System.out.print("The Summation is : ");
			System.out.println(num1+num2+num3);
			break;
		case 3:
			System.out.println("Enter four numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			num3=scan.nextDouble();
			num4=scan.nextDouble();
			System.out.print("The Summation is : ");
			System.out.println(num1+num2+num3+num4);
			break;
		default:
			System.out.println("Invalid Choice!  Please Choose the  options carefully");
		}
		
	}
	
	void subMenu()
	{
		double num1, num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice :\n1)Enter 1 to subtract two nos");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			System.out.print("The Subtraction is : ");
			System.out.println(num1-num2);
			break;
		default:
			System.out.println("Invalid Choice!  Please Choose the  options carefully");
		}
		
	}
	
	void mulMenu()
	{
		Double num1, num2, num3, num4;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice :\n1)Enter 1 to multiply two nos\n2)Enter 2 to multiply three nos\n3)Enter 3 to multiply four nos\n");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			System.out.print("The Multiplication is : ");
			System.out.println(num1*num2);
			break;
		case 2:
			System.out.println("Enter three numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			num3=scan.nextDouble();
			System.out.print("The Multiplication is : ");
			System.out.println(num1*num2*num3);
			break;
		case 3:
			System.out.println("Enter four numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			num3=scan.nextDouble();
			num4=scan.nextDouble();
			System.out.print("The Multiplication is : ");
			System.out.println(num1*num2*num3*num4);
			break;
		default:
			System.out.println("Invalid Choice!  Please Choose the  options carefully");
		}
		
	}
	
	void divMenu()
	{
		double num1, num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice :\n1)Enter 1 to divide two nos\n2)Enter 2 to divide three nos\n3)Enter 3 to divide four nos\n");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers separated by spaces :");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			System.out.print("The Division is : ");
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Invalid Choice!  Please Choose the  options carefully");
		}
		
	}
}
