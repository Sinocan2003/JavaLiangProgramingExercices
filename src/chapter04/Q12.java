package chapter04;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex digit: ");
		String hexDigit = input.nextLine().toUpperCase();
		
		if (hexDigit.length() != 1) {
			System.out.println("You must enter one character");
			System.exit(1);
		} 
		
		char digit = hexDigit.charAt(0);
		switch (digit) {
		case '0' + 17: System.out.println("The binary value is 1010"); break;
		case '1' + 17: System.out.println("The binary value is 1011"); break;
		case '2' + 17: System.out.println("The binary value is 1100"); break;
		case '3' + 17: System.out.println("The binary value is 1101"); break;
		case '4' + 17: System.out.println("The binary value is 1110"); break;
		case '5' + 17: System.out.println("The binary value is 1111"); break;
		
		default:
			System.out.println(digit + " is an invalid input");
		}
	}
}
