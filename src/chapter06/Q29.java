package chapter06;

public class Q29 {

	public static void main(String[] args) {
		int number = 3;
		while (number < 1000) {
			if (isPrime(number) && isPrime(number)) {
				System.out.printf("(%d, %d)\n", number, number+2);
			}
			number++;
		}
	}		
	
	
	public static boolean isPrime(int number) {
		int divisor = 2;
		while (divisor < number) {
			if (number % divisor != 0) {
				divisor++;
			} else {
				return false;
			}
		}
		return true;
	}
}