package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int[] primeNumbers = firstNPrime(50);
		System.out.println(Arrays.toString(primeNumbers));
		if (isPrime(number, primeNumbers)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	public static boolean isPrime(int number, int[] primeNumbers) {
		for (int i = 0; i < primeNumbers.length; i++) {
			if (number % primeNumbers[i] == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] firstNPrime(final int N) {
		int[] primeNumbers = new int[N];
		
		int number = 2;
		int count = 0;
		while (count < N) {
			if (isPrime(number)) {
				primeNumbers[count] = number;
				count++;
			}
			number++;
		}
		
		return primeNumbers;
	}

	public static boolean isPrime(int number) {
		boolean isPrime = true;

		for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
