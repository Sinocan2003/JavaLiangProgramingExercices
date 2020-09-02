package chapter04;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int character = input.nextInt();
		
		System.out.println("The character for ASCII code " + character + " is " + (char) character);
	}
}
