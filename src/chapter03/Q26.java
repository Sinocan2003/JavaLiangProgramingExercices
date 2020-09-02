package chapter03;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		boolean isDivisibleBy5And6 = integer % 5 == 0 && integer % 6 == 0;
		boolean b = integer % 5 == 0 || integer % 6 == 0;
		boolean c = integer % 5 == 0 && integer % 6 != 0 || integer % 5 != 0 && integer % 6 == 0;
		
		System.out.println("Is " + integer + " divisible by 5 and 6? " + isDivisibleBy5And6 + "\n" + 
				"Is " + integer + " divisible by 5 or 6? " + b + "\n" + 
				"Is " + integer + " divisible by 5 and 6, but not both? " + c);
	}
}
