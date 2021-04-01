package chapter06;

public class Q27 {

	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		while (count < 100) {
			int reverese = reverse(number);
			if (Q26.isPrime(number) && number != reverese && Q26.isPrime(reverese)) {
				count++;
				System.out.printf("%5d", number);

				if (count % 10 == 0)
					System.out.println();
			}

			number++;
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		return reverse;
	}
}
