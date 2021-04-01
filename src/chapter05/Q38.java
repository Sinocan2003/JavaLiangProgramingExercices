package chapter05;

import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal integer: ");
		int decimalInteger = input.nextInt();

		String octal = "";
		while (decimalInteger != 0) {
			octal = (decimalInteger % 8) + octal;
			decimalInteger /= 8;
		}
		System.out.println(octal);
	}
}
