package chapter06;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a password: ");
		String password = input.nextLine();

		if (isCorrectPassword(password)) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}
	}

	public static boolean isCorrectPassword(String password) {
		if (password.length() < 8) {
			return false;
		}

		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);

			if (!Character.isLetterOrDigit(ch))
				return false;

			if (Character.isDigit(ch))
				numberOfDigits++;
		}

		return (numberOfDigits >= 2);
	}
}