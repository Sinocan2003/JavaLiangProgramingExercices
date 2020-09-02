package chapter04;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		
		if (0 <= value && value <= 9) {
			System.out.println("The hex value is " + value);
		} else if (10 <= value && value <= 15) {
			System.out.println("The hex value is " + (char) (value + 'A' - 10));
		} else {
			System.out.println(value + " is an invalid input");
		}
	}
}
