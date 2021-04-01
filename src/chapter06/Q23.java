package chapter06;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		System.out.print("Enter a char to count in string: ");
		char ch = input.next().charAt(0);
		
		System.out.println("The string has " + count(string, ch) + " times " + ch + "  letter");
	}

	public static long count(String string, char ch) {
		int countLetter = 0; 
		for (int i = 0; i < string.length(); i++) {
			char ch2 = string.charAt(i);
			if (ch2 == ch) {
				countLetter++;
			} 
		}
		return countLetter;
	}
}
