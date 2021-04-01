package chapter05;

import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int n = 10;
			
		System.out.print("Enter " + n + " numbers: ");
		double number;
		double sum = 0;
		double sumOfSquare = 0;
		for (int i = 0; i < 10; i++) {
			number = input.nextDouble();
			sum += number;
			sumOfSquare += Math.pow(number, 2);
			
		}
		
		double mean = sum / n;
		double standardDeviation = Math.sqrt((sumOfSquare - (Math.pow(sum, 2) / n)) / (n - 1));
		
		System.out.println("Mean is " + mean);
		System.out.println("The standard deviation is " + standardDeviation);
	}
}
