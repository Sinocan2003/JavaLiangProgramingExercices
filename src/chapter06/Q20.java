package chapter06;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		System.out.println("This string has " + countLetters(string) + " letters");
		
	}

	public static int countLetters(String string) {
		int lenght = string.length();
		
		int numberOfLetters = 0;
		for (int i = 0; i < lenght; i++) {
			char ch = string.charAt(i);
			if (Character.isLetter(ch)) {
				numberOfLetters++;
			}
		}
		return numberOfLetters;
	}
}
