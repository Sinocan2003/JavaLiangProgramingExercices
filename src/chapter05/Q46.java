package chapter05;

import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		int lenght = string.length();
		for (int i = lenght - 1; i >= 0; i--) {
			 System.out.print(string.charAt(i));
		}
	}
}
