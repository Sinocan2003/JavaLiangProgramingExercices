package chapter02;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int digit1 = (number / 1  ) % 10;
		int digit2 = (number / 10 ) % 10;
		int digit3 = (number / 100) % 10;
		
		System.out.println("The sum of digits is " + (digit1 + digit2 + digit3));
	}
}
