package chapter05;

import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		for (int i = 0; i <= string.length() - 1; i++) {
			if (i % 2 != 0) 
				continue;
			
			System.out.print(string.charAt(i));
		}
	}
}
