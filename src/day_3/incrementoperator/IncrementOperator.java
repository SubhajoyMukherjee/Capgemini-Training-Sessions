package day_3.incrementoperator;

public class IncrementOperator {
	public static void main(String[] args) {
		int a = 2 , b = 6;
		int result = a++ + ++a + ++a + b++ - ++b - a++ + ++a - b++;
		System.out.println(result);

	}

}
