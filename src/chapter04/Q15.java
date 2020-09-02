package chapter04;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		if (Character.isLetter(letter)) {
			System.out.println("The corresponding number is " + (char) (letter - 15));
		} else {
			System.out.println( letter + " is an invalid input");
		}
	}
}
