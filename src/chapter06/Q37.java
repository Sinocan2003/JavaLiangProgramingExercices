package chapter06;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		System.out.print("Enter the width: ");
		int width = input.nextInt();

		System.out.println(format(number, width));
	}

	public static String format(int number, int width) {
		int digit = numberOfDigit(number);
		String format = "";
		for (int i = width - digit; i > 0; i--) {
			format += 0;
		}
		return format + number;
	}

	public static int numberOfDigit(int number) {
		int digit = 0;
		while (number != 0) {
			number /= 10;
			digit++;
		}
		return digit;
	}
}
