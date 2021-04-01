package chapter06;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.nextLine();

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isLetter(ch)) {
				ch = Character.toUpperCase(ch);
				System.out.print(getNumber(ch));
			} else {
				System.out.print(ch);
			}
		}

	}

	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter <= 'C') {
			return 2;
		} else if (uppercaseLetter <= 'F') {
			return 3;
		} else if (uppercaseLetter <= 'I') {
			return 4;
		} else if (uppercaseLetter <= 'L') {
			return 5;
		} else if (uppercaseLetter <= 'O') {
			return 6;
		} else if (uppercaseLetter <= 'S') {
			return 7;
		} else if (uppercaseLetter <= 'V') {
			return 8;
		} else  {
			return 9;
		}
	}
}
