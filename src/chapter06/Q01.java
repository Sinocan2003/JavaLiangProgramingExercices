package chapter06;

public class Q01 {

	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			System.out.printf("%6d", getPentagonalNumber(n));
			if (n % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static int getPentagonalNumber(int n) {
		return n * ((n * 3) - 1) / 2;
	}
}
