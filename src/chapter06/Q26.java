package chapter06;

public class Q26 {

	public static void main(String[] args) {

		int count = 0;
		int number = 2;

		while (count < 1000) {
			if (isPrime(number) && isPalindrome(number)) {
				System.out.printf("%7d", number);
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
			number++;
		}

	}

	public static boolean isPalindrome(int number) {
		int length = length(number);
		int low = 1;
		int high = (int) Math.pow(10, length - 1);

		for (int i = 0; i < length / 2; i++) {
			int digitLow = (number % (low * 10) / low);
			int digitHigh = number / high % 10;
			if (digitLow != digitHigh) {
				return false;
			}
			low *= 10;
			high /= 10;
		}

		return true;
	}

	// 123321

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

	public static int length(int number) {
		if (number == 0)
			return 1;

		int length = 0;
		while (number > 0) {
			number /= 10;
			length++;
		}
		return length;
	}
}
