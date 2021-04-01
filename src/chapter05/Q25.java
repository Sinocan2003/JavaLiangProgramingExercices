package chapter05;

public class Q25 {

	public static void main(String[] args) {
		double pi = 0;
		for (int i = 1; i <= 1_000_000_000; i++) {
			double formule = Math.pow(-1, i + 1) / (2 * i - 1);
			pi += formule;
			if (i == 10_000) {
				System.out.println("For i equals to 10000 pi is " + (4 * pi));
			} else if (i == 20_000) {
				System.out.println("For i equals to 20000 pi is " + (4 * pi));
			} else if (i == 100_000) {
				System.out.println("For i equals to 100000 pi is " + (4 * pi));
			} else if (i == 1_000_000) {
				System.out.println("For i equals to 1000000 pi is " + (4 * pi));
			} else if (i == 10_000_000) {
				System.out.println("For i equals to 10000000 pi is " + (4 * pi));
			} else if (i == 100_000_000) {
				System.out.println("For i equals to 100000000 pi is " + (4 * pi));
			} else if (i == 1_000_000_000) {
				System.out.println("For i equals to 1000000000 pi is " + (4 * pi));
			}
		}
		System.out.println("PI = " + Math.PI);
	}
}
