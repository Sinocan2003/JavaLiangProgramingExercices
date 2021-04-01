package chapter05;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Number of month: ");
		double numberOfMonth = input.nextInt();
		
		double monthlyInterestRate = (rate / 100) / 12;
		
		double finalAmount = 0;
		for (int i = 1; i <= numberOfMonth; i++) {
			 finalAmount = (amount + finalAmount) * (1 + monthlyInterestRate);
		}
		System.out.printf("%21s%3.3f","Your final amount is " , finalAmount);
	}
}
