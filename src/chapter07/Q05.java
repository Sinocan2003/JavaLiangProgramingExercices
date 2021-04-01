package chapter07;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			int number = input.nextInt();
			numbers[i] = number;
		}
		int[] distincNumbers = numbersOfDistinc(numbers);
		System.out.println("The number of distinc number is " + distincNumbers.length);
		
		print(distincNumbers);

	}

	public static void print(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static int[] numbersOfDistinc(int[] numbers) {
		int[] distincNumbers = new int[numbers.length];
		int distincNumbersCount = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			boolean found = false;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
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
