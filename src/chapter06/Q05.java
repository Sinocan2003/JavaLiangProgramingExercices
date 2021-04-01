package chapter06;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three number: ");
		int number = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		displaySortedNumbers(number, number2, number3);
	}
	
	/* 3! = 6
	 * 123
	 * 132
	 * 213
	 * 231
	 * 312
	 * 321
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if (num1 >= num2 && num2 >= num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if (num1 >= num3 && num3 >= num2) {
			System.out.println(num1 + " " + num3 + " " + num2);
		} else if (num2 >= num3 && num3 >= num1) {
			System.out.println(num2 + " " + num3 + " " + num1);
		} else if (num2 >= num1 &&  num1 >= num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
		} else if (num3 >= num1 && num1 >= num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		} else if (num3 >= num2 && num2 >= num1) {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
	}
}
