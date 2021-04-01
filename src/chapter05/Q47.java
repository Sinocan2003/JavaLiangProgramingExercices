package chapter05;

import java.util.Scanner;

public class Q47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an isbn number: ");
		// Long.parseLong(s)
		// Integer.parseInt(s)
		// Double.parseDouble(s)
		// String s = 5 + "";
		// int i = Integer.parseInt(s);
		long isbn = input.nextLong();
		
		int lenght = (isbn + "").length();
		
		if (lenght != 12) {
			System.out.println("Invalid input");
			System.exit(1);
		}
		
		long number = isbn;
		int sum = 0;
		for (int i = 12; i > 0; i--) {
			long digit = number % 10;
			
			sum +=  (i % 2 == 0) ? digit * 3 : digit;
			
			number /= 10;
		}
		int digit13 = 10 - (sum) % 10;
		
		if (digit13 == 10) {
			System.out.println("The isbn-13 number is " + isbn + 0);
		} else {
			System.out.println("The isbn-13 number is " + isbn + digit13);
		}
	}
}
