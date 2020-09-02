package chapter02;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double  savingAmount = input.nextDouble();
		
		final double INTEREST_RATE = (5.0 / 100) / 12;
		
		double firstMonthAmount = savingAmount * (1 + INTEREST_RATE);
		double secondMonthAmount = (firstMonthAmount + savingAmount) * (1 + INTEREST_RATE);
		double thirtMonthAmounth = (secondMonthAmount + savingAmount) * (1 + INTEREST_RATE);
		double fourthMonthAmounth = (thirtMonthAmounth + savingAmount) * (1 + INTEREST_RATE);
		double fivthMonthAmounth = (fourthMonthAmounth + savingAmount) * (1 + INTEREST_RATE);
		double sixthMonthAmounth = (fivthMonthAmounth + savingAmount) * (1 + INTEREST_RATE);
		
		System.out.printf("After the sixth month, the account value is %.2f", sixthMonthAmounth);
	}

}
