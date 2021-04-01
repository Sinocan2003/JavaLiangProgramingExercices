package chapter05;

public class Q26 {

	public static void main(String[] args) {
		double e = 1;
		double sum = 0;
		for (double i = 1; i <= 100000000; i++) {
			e *= i;
			sum += 1 / e;
			
			if (i == 10000) {
				System.out.println("For 10000, e is " + (1 + sum));
			} else if (i == 20000) {
				System.out.println("For 20000, e is " + (1 + sum));
			} else if (i == 100000) {
				System.out.println("For 100000, e is " + (1 + sum));
			} else if (i == 1000000) {
				System.out.println("For 1000000, e is " + (1 + sum));
			} else if (i == 10000000) {
				System.out.println("For 10000000, e is " + (1 + sum));
			} else if (i == 100000000) {
				System.out.println("For 100000000, e is " + (1 + sum));
			}
		}
	}
}
