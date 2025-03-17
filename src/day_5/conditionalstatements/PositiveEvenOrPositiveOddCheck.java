package day_5.conditionalstatements;

import java.util.Scanner;

public class PositiveEvenOrPositiveOddCheck {
	public static void main(String[] args)
	{
		System.out.println("Enter the Number : ");
		int num;
		Scanner scan= new Scanner(System.in);
		num=scan.nextInt();
		if(num>=0)
		{
			if(num%2==0)
			{
				System.out.println("This is positive even.");
			}
			else
			{
				System.out.println("This is positive odd.");
			}
		}
		
	}
	

}
