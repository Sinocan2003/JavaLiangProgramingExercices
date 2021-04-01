package chapter07;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int number = input.nextInt();
		int[] values = new int[number];
		
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {
		int previousNumber = values[0];
		int count = 1;
		for (int i = 0; i < values.length; i++) {
			if (count == 4) {
				return true;
			} else if (values[i] == previousNumber) {
				count++;
			} else {
				previousNumber = values[i];
				count = 1;
			}
		}
			return false;
	}
}
