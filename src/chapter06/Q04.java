package chapter06;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		revers(number);
	}

	public static void revers(int number) {
		while (number >= 1) {
			int digit = number % 10;
			number /= 10;
			System.out.print(digit);
		}
	}
}
