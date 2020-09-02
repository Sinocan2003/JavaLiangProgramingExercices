package chapter03;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a isbn number: ");
		int isbn = input.nextInt();

		int d1 = (isbn / 100_000_000) % 10;
		int d2 = (isbn / 10_000_000) % 10;
		int d3 = (isbn / 1_000_000) % 10;
		int d4 = (isbn / 100_000) % 10;
		int d5 = (isbn / 10_000) % 10;
		int d6 = (isbn / 1000) % 10;
		int d7 = (isbn / 100) % 10;
		int d8 = (isbn / 10) % 10;
		int d9 = (isbn / 1) % 10;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) {
			System.out.println("The ISBN-10 number is " + isbn + "X ");
		} else {
			System.out.println("The ISBN-10 number is " + isbn + d10);
		}
	}

}
