package chapter04;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade(A-F): ");
		char letter = input.next().charAt(0);
		
		if (letter < 'A' || letter > 'F') {
			System.out.println( letter + " is an invalid grade");
		} else {
			System.out.print("The numeric value for grade " + letter + " is ");//+ (4 - (letter - 'A')));
			switch (letter) {
			case 'A': System.out.println("A"); break;
			case 'B': System.out.println("A"); break;
			case 'C': System.out.println("A"); break;
			case 'D': System.out.println("A"); break;
			case 'E': System.out.println("A"); break;
			case 'F': System.out.println("A"); break;
			}
		}
	}
}
