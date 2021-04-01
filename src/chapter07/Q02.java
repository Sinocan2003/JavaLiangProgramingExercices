package chapter07;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter " + numbers.length + " inigers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int[] result = revers(numbers);
		print(result);

	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] revers(int[] numbers) {
		int[] result = new int[numbers.length];
		
		for (int i = 0, j = result.length - 1; i < numbers.length; i++, j--) {
			result[j] = numbers[i];
		}
		
		return result;
	}
}
