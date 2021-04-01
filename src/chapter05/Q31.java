package chapter05;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double rate = input.nextDouble();

		System.out.print("Number of month: ");
		double numberOfMonth = input.nextInt();

		double finalAmount = amount;
		System.out.println("Month\tCD Value");
		for (int i = 1; i <= numberOfMonth; i++) {
			finalAmount = finalAmount + (finalAmount * rate / 1200);
			System.out.printf("%3d\t%10.2f\n", i, finalAmount);
		}

	}
}
