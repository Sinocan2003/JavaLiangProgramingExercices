package chapter07;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5];
		System.out.print("Eneter five numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			int number = input.nextInt();
			numbers[i] = number;
		}
		
		int gcd =  gcd(numbers);
		System.out.println("The gdc is " + gcd);
	}

	public static int gcd(int[] numbers) {
		int min = minNumber(numbers);
		
		int gcd = 1;
		for (int i = 2; i <= min; i++) {
			if (isDivirsAll(numbers, i))  {
				gcd = i;
			}

		}
		return gcd;
	}

	public static boolean isDivirsAll(int[] numbers, int i) {
		for (int n : numbers) 
			if (n % i != 0)
				return false;
		
		return true;
	}

	private static int minNumber(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
}
