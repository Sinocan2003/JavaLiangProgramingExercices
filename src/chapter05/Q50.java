package chapter05;

import java.util.Scanner;

public class Q50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.next();

		int numberOfUpper = 0;
		int lenght = string.length();
		for (int i = 0; i < lenght; i++) {
			char ch = string.charAt(i);
			if (Character.isUpperCase(ch)) {
				numberOfUpper++;	
			}
		}
		
		System.out.println("The number of uppercase letters is " + numberOfUpper);
	}

}
