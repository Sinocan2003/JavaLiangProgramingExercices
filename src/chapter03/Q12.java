package chapter03;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		double digit1 = number % 10;
		int digit3 = number / 100;
		
		if (digit3 == digit1) {
			System.out.println(number + " is palindrom");
		} else {
			System.out.println(number + " is not a palindrom");
		}

	}

}
