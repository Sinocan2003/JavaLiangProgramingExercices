package chapter06;

public class Q14 {

	public static void main(String[] args) {
		System.out.println("i        m(i)");
		System.out.println("-----------------");

		int i = 1;
		for (int j = 1; j <= 10; j++) {
			System.out.printf("%4d%6s%7.4f%1s", i, "", estimatePi(i), "\n");
			i += 100;
		}
	}

	public static double estimatePi(int i) {
		double sum = 0;
		int j = 1;
		while (j <= i) {
			sum += Math.pow(-1, j + 1) / ((2 * j) - 1);
			j++;
		}
		return 4 * sum;
	}
}