package chapter05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		double numberOfPositive = 0;
		double numberOfNegative = 0;
		double sum = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int integer = input.nextInt();

		while (integer != 0) {
			sum += integer;

			if (integer > 0) {
				++numberOfPositive;
			} else if (integer < 0) {
				++numberOfNegative;
			}
			integer = input.nextInt();
		}

		System.out.println("The number of positives is " + numberOfPositive + "\n" + "The number of negative is "
				+ numberOfNegative + "\n" + "The total is " + sum + "\n" + "The average is "
				+ (sum / (numberOfNegative + numberOfPositive)));
	}
}
