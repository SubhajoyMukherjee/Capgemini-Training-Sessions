package day_3.logicaloperators;

public class PositiveEvenOrPositiveOddCheck {
	void positiveEvenOrPositiveOddCheck(int num1)
		{
			if(num1>0 && num1%2==0)
			{
				System.out.println("Positive Even Number");
			}
			else if(num1>0 && num1%2!=0)
			{
				System.out.println("Postive Odd Number");
			}
			else if (num1<0 && num1%2==0)
			{
				System.out.println("Negative Even Number");
			}
			else
			{
				System.out.println("Negative Odd Number");
			}
		}
	public static void main(String[] args)
	{
		//int num1, num2;
		
		
	}
}
