package chapter06;

public class Q28 {

	public static void main(String[] args) {
		System.out.println("p               2^p –1");
		System.out.println("----------------------");

		for (int p = 2; p <= 31; p++) {
			if (Q26.isPrime(p)) {
				int mersenneNumber = (int) Math.pow(2, p) - 1;
				if (Q26.isPrime(mersenneNumber)) {
					System.out.printf("%3d%20s%15d\n", p, "", mersenneNumber);
				}
			}
		}
	}
}