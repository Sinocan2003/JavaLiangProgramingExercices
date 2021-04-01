package chapter05;

public class Q20 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; 
		int count = 0; 
		int number = 2; 

		System.out.println("The prime numbers between 2 and 1000 \n");
		int innerForCount = 0;

		while (number < 1000) {
			boolean isPrime = true; 

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				innerForCount++;
				if (number % divisor == 0) {
					isPrime = false; 
					break; 
				}
			}

			if (isPrime) {
				count++; 

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}

			number++;
		}
		System.out.println(innerForCount);

	}
}
