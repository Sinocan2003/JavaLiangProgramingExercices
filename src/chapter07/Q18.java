package chapter07;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.print("Enter ten number: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		//Q16.sortingArray(numbers);
		bubbleSort(numbers);
		
		printArray(numbers);
	}

	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static void bubbleSort(int[] numbers) {
		for (int j = 0; j < numbers.length; j++) {
			boolean swaped = false;
			for (int i = 0; i < numbers.length - 1 - j; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swaped = true;
				}
			}
			if (swaped == false)
				break;
		}
	}
}
