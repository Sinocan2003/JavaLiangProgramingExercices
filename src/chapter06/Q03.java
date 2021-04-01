package chapter06;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if (isPalindrome(number)) {
			System.out.println(number + " is palindron");
		} else {
			System.out.println(number + " is not palindron");
		}
	}

	// Return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		return (reverse(number) == number);
	}

	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10 + (number % 10);
			number /= 10;
		}
		return reverse;
	}

}
