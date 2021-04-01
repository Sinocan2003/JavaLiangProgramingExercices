package chapter05;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a isbn number: ");
		int isbn = input.nextInt();

		int number = 100_000_000;
		int digit = 0;
		int digit10 = 0;
		for (int i = 1; i <= 9; i++) {
			digit = (isbn / number) % 10;
			number /= 10;
			digit10 += digit * i;
		}
		
		digit10 = digit % 11;
		
		if (digit10 == 10) {
			System.out.println("The ISBN-10 number is " + isbn + "X ");
		} else {
			System.out.println("The ISBN-10 number is " + isbn + digit10);
		}
	}
}
