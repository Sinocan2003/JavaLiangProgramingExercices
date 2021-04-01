package chapter05;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan amount: ");
		double amount = input.nextInt();
		
		System.out.print("Number of Years: ");
		int year = input.nextInt();
		
		System.out.println( "Interest Rate      Monthly Payment      Total Payment");
		
		for (double rate = 5; rate <= 8; rate += 0.125) {
			double monthlyInterestRate = rate / 1200;
			double monthlyPayment = amount * monthlyInterestRate / (1
				      - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
			double totalPayment = monthlyPayment * year * 12;
			System.out.printf("%1.3f%14s%1.2f%15s%1.2f\n" , rate , "" , monthlyPayment , "" , totalPayment);
		}
	}
}
