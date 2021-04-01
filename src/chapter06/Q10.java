package chapter06;

public class Q10 {

	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(10000);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; 
		int count = 0; 
		int number = 2; 

		while (number <= numberOfPrimes) {
			if (isPrime(number)) {
				System.out.printf("%10d", number);
				
				count++; 
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println();
				}
			}

			number++;
		}
		System.out.println("\nNumber of primes less then " + numberOfPrimes + " is = " + count);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { 
				return false; 
			}
		}

		return true; 
	}
}
