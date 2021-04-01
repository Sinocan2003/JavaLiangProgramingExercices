package chapter05;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
			      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("Monthly Payment: " + monthlyPayment + "\n" + "Total Payment: " + totalPayment);
		
		System.out.println("Payment#        Interest        Principal        Balance");
		
		for (double i = 1; i <= (numberOfYears * 12); i++) {
			double interest = ((loanAmount / (12)) * annualInterestRate) / 100;
			double principal = monthlyPayment - interest;
			double balance = loanAmount - (principal);
			loanAmount = balance;
			System.out.printf("%2.0f%20.2f%17.2f%18.2f\n" , i , interest , principal , balance);
		}
	}
}
