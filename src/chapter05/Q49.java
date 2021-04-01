package chapter05;

import java.util.Scanner;

public class Q49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		int vowelNumbers = 0;
		int consonants = 0;
		int lenght = string.length();
		for (int i = 0; i < lenght; i++) {
			char ch = Character.toUpperCase(string.charAt(i));
			
			if (Character.isLetter(ch)) {
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||	ch == 'U') {
					vowelNumbers++;
				} else if (ch != ' '){
					consonants++;
				}
			}
		}
		System.out.println("The number of vowels is " + vowelNumbers + "\n" 
		+ "The number of consonants is " + consonants);
	}
}
