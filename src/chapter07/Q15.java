package chapter07;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			int number = input.nextInt();
			numbers[i] = number;
		}
		int[] realDistincNumbers = eliminateDuplicates(numbers);
		print(realDistincNumbers);
		
	}

	public static void print(int[] realDistincNumbers) {
		System.out.print("The distinct numbers are ");
		for (int i = 0; i < realDistincNumbers.length; i++) {
				System.out.print(realDistincNumbers[i] + " ");
		}
	}

	public static int[] eliminateDuplicates(int[] numbers) {
		int[] distincNumbers = new int[numbers.length];
		int distincNumbersCount = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			boolean found = false;
			for (int j = 0; j < distincNumbersCount; j++) {
				if (numbers[i] == distincNumbers[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				distincNumbers[distincNumbersCount] = numbers[i];
				distincNumbersCount++;
			}
		}
		
		int[] realDistincNumbers = new int[distincNumbersCount];
		for (int i = 0; i < distincNumbersCount; i++) {
			realDistincNumbers[i] = distincNumbers[i];
		}
		
		return realDistincNumbers;
	}
}
