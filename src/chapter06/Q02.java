package chapter06;

public class Q02 {

	public static void main(String[] args) {
		int num = 234;
		System.out.println(sumDigit(num));
	}
	
	public static int sumDigit(int num1) {
		int sum = 0;
		while (num1 >= 1) {
			 sum += num1 % 10;
			 num1 /= 10;
		}
		return sum;	
	}
}
