package chapter05;

public class Q33 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 10000; i++) {
			int divisor = 2;
			int sum = 0;
			for (divisor = 2; divisor < i; divisor++) {
				if (i % divisor == 0) {
					sum += divisor;
				}
			}
			if (sum + 1 == i) {
				System.out.print(i + " ");
			}
		}
	}
}
