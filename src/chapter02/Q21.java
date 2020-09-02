package chapter02;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble() / 100 / 12;
		
		System.out.print("Enter number of years: ");
		double year = input.nextDouble();
		
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, year * 12);
		
		System.out.println("Accumulated value is " + futureInvestmentValue);

	}

}
