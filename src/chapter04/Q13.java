package chapter04;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		
		char upperLetter = Character.toUpperCase(letter);
		
		if (upperLetter == 'A' || upperLetter == 'E' || upperLetter == 'I' || upperLetter == 'O' || upperLetter == 'U') {
			System.out.println(letter + " is a vowel!");
		} else if (Character.isLetter(letter)) {
			System.out.println(letter + " is a consonant!");
		} else {
			System.out.println(letter + " is an invalid input");
		}
	}
}