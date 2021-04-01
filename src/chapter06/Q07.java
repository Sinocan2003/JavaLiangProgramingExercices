package chapter06;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println("Year\tFuture Value");
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%3d\t%10.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
